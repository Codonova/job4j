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
     * @param first  первое число
     * @param second второе число
     * @return result
     */
    public static int max(int first, int second) {
        int max = first > second ? first : second;
        return max;
    }

    /**
     * Поиск максимального значения из трех чисел
     * @param first
     * @param second
     * @param third
     * @return
     */

    public static int max(int first, int second, int third) {
         return max(first, max(second, third));
    }

    /**
     * Поиск максимального значения из четырех чисел
     * @param first
     * @param second
     * @param third
     * @param forth
     * @return
     */

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, third, forth));
    }
}
