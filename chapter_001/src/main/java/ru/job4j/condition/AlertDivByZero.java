package ru.job4j.condition;

/**
 * AlertDivByZero
 *
 * @author Ruslan Kooslapchenkov
 */

public class AlertDivByZero {

    /**
     * main
     *
     * @param args args
     */
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    /**
     * Метод проверяет, возможно ли делить на это число.
     *
     * @param number входящее число
     */

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        if (number < 0) {
            System.out.println("This is negative numbers");
        }
    }
}
