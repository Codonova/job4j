package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Point
 *
 * @author Ruslan Kooslapchenkov
 */

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Метод проверяет расстояние от одной точки до второй
     * @param that
     * @return
     */

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * main
     *
     * @param args args
     */

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}
