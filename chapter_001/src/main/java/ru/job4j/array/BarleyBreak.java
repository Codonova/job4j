package ru.job4j.array;

public class BarleyBreak {

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ++num;
            }

        }
        print(array);

    }
}
