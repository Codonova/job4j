package ru.job4j.array;

/**
 * Matrix
 * @author Ruslan Kooslapchenkov
 */

public class Matrix {
    /**
     * Логика таблицы умножения
     * @param size размер массива
     * @return table таблица умножения
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
