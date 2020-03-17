package ru.job4j.calculator;

/**
 * Fit
 * @author Ruslan Kooslapchenkov
 */

public class Fit {

    /**
     * Вычисляет идеальный вес для мужчин
     * @param height вес
     * @return rsl
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * Вычисляет идеальный вес для женщин
     * @param height вес
     * @return rsl
     */

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    /**
     * main
     * @param args args
     */

    public static void main(String[] args) {
        double man = Fit.manWeight(100);
        System.out.println("Man 100 is " + man);
        double woman = Fit.womanWeight(110);
        System.out.println("Woman 110 is " + woman);
    }
}
