package collection.map.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> values = users.get(user.get());
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

    public Optional<User> findByPassport(String passport) {
      /*  User user = null;
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                user = key;
                break;
            }
        }
        // return user;

       */
       /* return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
        */
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод осуществляет поиск счета пользователя, по реквизитам
     *
     * @param passport
     * @param requisite
     * @return счет пользователя
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
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
        Optional<User> user = findByPassport(passport);
        Optional<Account> opt = Optional.empty();
        return user.map(value -> users.getOrDefault(value, new ArrayList<>())
                .stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst()).orElse(opt);
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent() && srcAccount.get().getBalance() == amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}