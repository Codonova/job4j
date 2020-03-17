package ru.job4j.loop;

/**
 * Factorial
 *
 * @author Ruslan Kooslapchenkov
 */

public class Factorial {

    /**
     * Считает факториал числа
     *
     * @param n число
     * @return result
     */

    public static int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
