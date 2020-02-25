package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            percent = amount / amount * percent;
            amount += percent;
            amount -= salary;

            year++;
        }
        return year;
    }
}
