package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
<<<<<<< HEAD
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
=======
        boolean prime = false;

        if (number == 2) {
            prime = true;
        }
        for (int i = 2; i <= number; i++) {
            if (number % i != 0) {
                prime = true;
>>>>>>> fa378ef6ad68e7d6d771d73ddd98351aff658e25
            }

        }
        return prime;
    }
}

