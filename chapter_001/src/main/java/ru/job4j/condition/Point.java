package ru.job4j.condition;

/**
 * Point
 *
 * @author Ruslan Kooslapchenkov
 */

public class Point {

    /**
     * Вычисляет расстояние между координатами
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return rsl
     */

    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(5, 3, 8, 9);
        System.out.println("result (5, 3) to (8, 9) " + result);
    }
}
