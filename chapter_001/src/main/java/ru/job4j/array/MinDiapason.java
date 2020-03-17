package ru.job4j.array;

/**
 * MinDiapason
 * @author Ruslan Kooslapchenkov
 */

public class MinDiapason {
    /**
     * Поиск минимального значения в заданном диапазоне
     * @param array входящий массив
     * @param start индекс начала поиска
     * @param finish индекс конца поиска
     * @return min минимальное значение
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
