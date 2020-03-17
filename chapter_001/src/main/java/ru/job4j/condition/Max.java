package ru.job4j.condition;

/**
 * Max
 *
 * @author Ruslan Kooslapchenkov
 */

public class Max {

    /**
     * Поиск максимального значения из двух чисел
     *
     * @param left  первое число
     * @param right второе число
     * @return result
     */
    public static int max(int left, int right) {
        boolean max = left > right;
        int result = max ? left : right;
        return result;
    }
}
