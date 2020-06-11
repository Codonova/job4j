package collection.Map.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в хранилище
     * @param user
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет аккаунт
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
     * @param passport
     * @return пользователь
     */

    public User findByPassport(String passport) {
        User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        return user;
    }

    /**
     * Метод осуществляет поиск счета пользователя, по реквизитам
     * @param passport
     * @param requisite
     * @return счет пользователя
     */

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> values = users.get(user);
            int index = values.indexOf(new Account(requisite, 0));
            if (index != -1) {
                account = values.get(index);
            }
        }

        return account;
    }

    /**
     * Метод осуществляет перевод денег со счета на счет
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param dеstRequisite
     * @param amount
     * @return Переведены деньги или нет
     */

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String
            dеstRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, dеstRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() == amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
