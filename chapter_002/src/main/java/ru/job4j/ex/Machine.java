package ru.job4j.ex;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int res = money - price;
        for (int i = 0; i < COINS.length; i++) {
            while (res >= COINS[i]) {
                res -= COINS[i];
                rsl[size++] = COINS[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        Machine machine = new Machine();
        int res[] = machine.change(100, 71);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
