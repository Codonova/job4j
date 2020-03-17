package ru.job4j.loop;

/**
 * Mortgage
 *
 * @author Ruslan Kooslapchenkov
 */

public class Mortgage {

    /**
     * Ипотечный калькулятор. считает за сколько лет можно закрыть ипотеку
     *
     * @param amount  сумма кредита
     * @param salary  зарплата
     * @param percent проценты по кредиту
     * @return
     */

    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            amount += (amount * (int) percent / 100);
            amount -= salary;
            year++;
        }
        return year;
    }
}
