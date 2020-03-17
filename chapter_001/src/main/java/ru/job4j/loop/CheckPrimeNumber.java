package ru.job4j.loop;

/**
 * CheckPrimeNumber
 *
 * @author Ruslan Kooslapchenkov
 */

public class CheckPrimeNumber {

    /**
     * Проверяет натуральное число или нет
     *
     * @param number число
     * @return prime true or false
     */
    public static boolean check(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        if (number == 2) {
            prime = true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}

