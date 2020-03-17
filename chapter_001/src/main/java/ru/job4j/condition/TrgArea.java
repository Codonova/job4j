package ru.job4j.condition;

/**
 * TrgArea
 *
 * @author Ruslan Kooslapchenkov
 */

public class TrgArea {

    /**
     * Поиск площади треугольника
     *
     * @param a первая сторона
     * @param b вторая сторона
     * @param c третья сторона
     * @return rsl
     */

    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
        return rsl;
    }

    /**
     * main
     *
     * @param args args
     */

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
