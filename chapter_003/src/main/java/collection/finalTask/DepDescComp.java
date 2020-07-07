package collection.finalTask;

import java.util.Collection;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        String[] left = o1.split("/");
        String[] right = o2.split("/");
        rsl = right[0].compareTo(left[0]);
        if (rsl == 0) {
            rsl = o1.compareTo(o2);
        }
        return rsl;

    }
}
