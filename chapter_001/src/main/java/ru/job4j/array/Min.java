package ru.job4j.array;

/**
 * Min
 * @author Ruslan Kooslapchenkov
 */

public class Min {
    /**
     * Поиск минимального знаечния
     * @param array входящий масив
     * @return min минимальное значение
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
           if (min > array[i]) {
               min = array[i];
           }
        }
        return min;
    }
}
