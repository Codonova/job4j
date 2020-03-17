package ru.job4j.loop;

/**
 * Counter
 *
 * @author Ruslan Kooslapchenkov
 */

public class Counter {

    /**
     * Суммирует числа в заданном диапазоне
     *
     * @param start  начало
     * @param finish конец
     * @return sum
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Суммирует четный числа в заданном диапазоне
     *
     * @param start  начало
     * @param finish конец
     * @return sum
     */

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));

        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(3, 8));
        System.out.println(sumByEven(1, 1));
    }
}
