package collection.map.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в хранилище
     *
     * @param user
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет аккаунт
     *
     * @param passport
     * @param account
     */

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> values = users.get(user);
            if (!values.contains(account)) {
                values.add(account);
            }
        }
    }

    /**
     * Метод осуществляет поиск пользователя по паспорту
     *
     * @param passport
     * @return пользователь
     */

    public User findByPassport(String passport) {
      /*  User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        // return user;

       */
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод осуществляет поиск счета пользователя, по реквизитам
     *
     * @param passport
     * @param requisite
     * @return счет пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
      /* Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> values = users.get(user);
            int index = values.indexOf(new Account(requisite, 0));
            if (index != -1) {
                account = values.get(index);
            }
        }
        */
        User user = findByPassport(passport);
        if (user != null) {
            return users.getOrDefault(user, null)
                    .stream()
                    .filter(e -> e.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод осуществляет перевод денег со счета на счет
     *
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return Переведены деньги или нет
     */

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() == amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}