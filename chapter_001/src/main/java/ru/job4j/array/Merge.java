package ru.job4j.array;

import java.util.Arrays;

/**
 * Merge
 * @author Ruslan Kooslapchenkov
 */

public class Merge {
    /**
     * Соединяет два отсортированных массива в один отсортированный
     * @param left превый массив
     * @param right второй массив
     * @return rsl итоговый массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i + j < rsl.length) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    rsl[k] = left[i];
                    i++;
                } else {
                    rsl[k] = right[j];
                    j++;
                }
            } else if (i < left.length) {
                rsl[k] = left[i];
                i++;
            } else if (j < right.length) {
                rsl[k] = right[j];
                j++;
            }
            k++;
        }
        return rsl;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
