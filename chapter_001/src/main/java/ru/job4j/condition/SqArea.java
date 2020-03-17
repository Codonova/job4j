package ru.job4j.condition;

/**
 * SqArea
 *
 * @author Ruslan Kooslapchenkov
 */

public class SqArea {

    /**
     * Вычиляет площадь прямоугольника
     *
     * @param p периметр
     * @param k коэффициент
     * @return rsl
     */

    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        result1 = SqArea.square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result1);
    }
}