package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int i = 0; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
                count++;
            }
<<<<<<< HEAD
=======

>>>>>>> fa378ef6ad68e7d6d771d73ddd98351aff658e25
        }
        return count;
    }
}
