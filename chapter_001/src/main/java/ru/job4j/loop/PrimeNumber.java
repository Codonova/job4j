package ru.job4j.loop;

/**
 * PrimeNumber
 *
 * @author Ruslan Kooslapchenkov
 */

public class PrimeNumber {

    /**
     * Считает количество натуральных чисел
     *
     * @param finish конец диапазона
     * @return count
     */

    public int calc(int finish) {
        int count = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
        }
        return count;
    }
}
