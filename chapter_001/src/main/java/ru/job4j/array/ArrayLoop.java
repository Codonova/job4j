package ru.job4j.array;

/**
 * ArrayLoop
 * @author Ruslan Kooslapchenkov
 */

public class ArrayLoop {

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
