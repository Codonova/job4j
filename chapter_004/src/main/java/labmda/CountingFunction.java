package labmda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CountingFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            double x = i;
        list.add(func.apply(x));
        }
        return list;
    }
}
