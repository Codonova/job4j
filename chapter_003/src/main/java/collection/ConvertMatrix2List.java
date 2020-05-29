package collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public static List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(int[] row : array) {
            for(int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
