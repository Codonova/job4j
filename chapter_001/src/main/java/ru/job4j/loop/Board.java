package ru.job4j.loop;

/**
 * Board
 *
 * @author Ruslan Kooslapchenkov
 */

public class Board {

    /**
     * Печатает таблицу по параметрам
     *
     * @param width  высота
     * @param height ширина
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * main
     *
     * @param args args
     */

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
        System.out.println();
        paint(7, 5);
    }
}
