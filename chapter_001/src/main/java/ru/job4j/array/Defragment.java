package ru.job4j.array;

/**
 * Defragment
 * @author Ruslan Kooslapchenkov
 */

public class Defragment {
    /**
     * Дефрагментация массива, перемещает значения null в конец массива.
     * @param array входяий массив
     * @return
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                int count = i;
                while (count < array.length) {
                    if (array[count] != null) {
                        array[point] = array[count];
                        array[count] = null;
                        break;
                    }
                    count++;
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
