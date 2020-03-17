package ru.job4j.condition;

/**
 * MultiMax
 *
 * @author Ruslan Kooslapchenkov
 */

public class MultiMax {

    /**
     * Поиск максимального значения из трех чисел
     *
     * @param first  первое число
     * @param second второе число
     * @param third  третье число
     * @return result
     */
    public int max(int first, int second, int third) {
        int result = first > second ? ((first > third) ? first : third) : ((second > third) ? second : third);
        return result;
    }
}
