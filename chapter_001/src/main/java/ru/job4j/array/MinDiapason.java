package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            } else if (i == finish) break;
        }
        return min;
    }
}
