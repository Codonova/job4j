package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static List<Integer> stream(List<Integer> numbers) {
        List<Integer> rsl = numbers.stream().filter(
                num -> num >= 0
        ).collect(Collectors.toList());
        return rsl;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 9, -3, -5, 4);
        for (Integer value : stream(numbers)) {
            System.out.println(value);
        }

    }
}
