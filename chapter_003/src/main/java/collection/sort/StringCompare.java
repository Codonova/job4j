package collection.sort;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int len1 = left.length();
        int len2 = right.length();
        int len = Math.min(len1, len2);
        for (int i = 0; i < len; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                return rsl;
            }
        }
        return Integer.compare(len1, len2);
    }
}
