package collection.finalTask;

import java.util.*;

public class Departments {
    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                if (start.equals("")) {
                    start = el;
                    tmp.add(start);
                } else {
                    start += "/" + el;
                    tmp.add(start);
                }

            }
        }
      //  List<String> rsl = new ArrayList<>(tmp);
      //  sortAsc(rsl);
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
    }
}
