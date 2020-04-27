package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    /**
     * Метод определяет игрока
     * @param count
     * @return
     */

    public static String players(int count) {
        String player;
        if (count % 2 == 0) {
            player = "Игрок 1";
        } else {
            player = "Игрок 2";
        }
        return player;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        boolean run = true;
        int count = 0;
        while (run) {
            System.out.println("Ходит: " + players(count));
            int move = Integer.valueOf(scanner.nextLine());
            if (move > 0 && move < 4) {
                if (matches - move < 0) {
                    matches += move;
                    System.out.println("Неверный ход: Нельзя забрать больше чем осталось. Попробуйте снова.");
                    count--;
                }
                matches -= move;
                count++;
            } else {
                System.out.println("Неверный ход: Можно взять от 1 до 3 спичек");
            }
            if (matches == 0) {
                run = false;
                System.out.println("Победил: " + players(--count));
                break;
            }
            System.out.println("Осталось спичек - " + Integer.valueOf(matches));
        }

    }
}
