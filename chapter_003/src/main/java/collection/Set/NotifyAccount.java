package collection.Set;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        // for-each accounts to HashSet;
        for (Account s : accounts) {
            rsl.add(s);
        }
        return rsl;
    }
}
