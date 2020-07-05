package collection.finalTask;

import java.util.Collection;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        for (String el01 : left) {
            for (String el02 : right) {
                if (el02.compareTo(el01) == 0) {
                    rsl = o1.compareTo(o2);
                    break;
                }
            }
        }
        //  if (right[0].equals(left[0])) {
        //      rsl = o1.compareTo(o2);
        return rsl;

    }
}
