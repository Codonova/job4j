package ru.job4j.array;

/**
 * Turn
 * @author Ruslan Kooslapchenkov
 */

public class Turn {
    /**
     * Переворачивает массив
     * @param array входящий массив
     * @return array
     */
    public static int[] back(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1 - i; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
