package ru.job4j.array;

/**
 * SortSelected
 * @author Ruslan Kooslapchenkov
 */

public class SortSelected {
    /**
     * Сортировка выбором
     * @param data входящий массив
     * @return data отсортированный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            if (min < data[i]) {
                int temp = data[i];
                data[i] = min;
                data[index] = temp;
            }
        }
        return data;
    }
}

