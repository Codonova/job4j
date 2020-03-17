package ru.job4j.array;

/**
 * SwitchArray
 * @author Ruslan Kooslapchenkov
 */

public class SwitchArray {
    /**
     * меняет местами элементы массива по индексу
     * @param array входящий массив
     * @param source индекс массива
     * @param dest индекс массива
     * @return array массив
     */
    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest];
        array[dest] = temp;
        return array;
    }

    /**
     * Меняет первый и последний элемент массива
     * @param array входящий массив
     * @return array массив
     */

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}
