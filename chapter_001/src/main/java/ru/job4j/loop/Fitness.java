package ru.job4j.loop;

/**
 * Fitness
 *
 * @author Ruslan Kooslapchenkov
 */

public class Fitness {

    /**
     * Метод считает, сколько месяцев нужно Ивану чтобы перегнать Николая по тяжести снарядов в спортзале
     *
     * @param ivan текущий вес который может поднять
     * @param nik  текущий вес который может поднять
     * @return month
     */

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }
}
