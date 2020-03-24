package ru.job4j.oop.max;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array; // array = array - в этом случае мы пытались присвоить значение переменной самой себе.
                            // А нам нужно присвоить значение поля класса.
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
