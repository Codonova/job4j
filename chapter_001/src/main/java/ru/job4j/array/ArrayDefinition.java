package ru.job4j.array;

/**
 * ArrayDefinition
 * @author Ruslan Kooslapchenkov
 */

public class ArrayDefinition {
    /**
     * main
     * @param args args
     */
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ruslan";
        names[1] = "Oleg";
        names[2] = "Anton";
        names[3] = "Nikita";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
