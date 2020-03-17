package ru.job4j.array;

/**
 * Square
 * @author Ruslan Kooslapchenkov
 */

public class Square {
    /**
     * Квадратный корень числа
     * @param bound размер массива
     * @return rst массив квардратных корней
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
