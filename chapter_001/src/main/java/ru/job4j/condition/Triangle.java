package ru.job4j.condition;

public class Triangle {

    /**
     * Метод проверят - существует ли треугльник
     *
     * @param ab первая сторона
     * @param ac вторая сторона
     * @param bc третья сторона
     * @return
     */
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}
