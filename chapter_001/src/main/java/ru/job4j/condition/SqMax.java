package ru.job4j.condition;

/**
 * SqMax
 *
 * @author Ruslan Kooslapchenkov
 */

public class SqMax {

    /**
     * Поиск максимального значения из четырех чисел
     *
     * @param first
     * @param second
     * @param third
     * @param forth
     * @return result
     */
    public static int max(int first, int second, int third, int forth) {
        int result = forth;

        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                } else {
                    result = forth;
                }
            } else if (third > forth) {
                result = third;
            } else {
                result = forth;
            }


        } else if (second > third) {
            if (second > forth) {
                result = second;
            } else {
                result = forth;
            }

        } else if (third > forth) {
            result = third;

        } else {
            result = forth;
        }
        return result;
    }
}