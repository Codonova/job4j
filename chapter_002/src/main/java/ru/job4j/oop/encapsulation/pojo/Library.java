package ru.job4j.oop.encapsulation.pojo;

public class Library {

    /**
     * Печатает наименование и кол-во страниц в книге.
     *
     * @param mass входящий массив
     */

    public static void print(Book[] mass) {
        for (int i = 0; i < mass.length; i++) {
            Book bks = mass[i];
            System.out.println(bks.getName() + " - " + bks.getPageCount());
        }
        System.out.println();
    }

    /**
     * Меняет местами значения по индексам
     * @param mass
     * @param index1
     * @param index2
     * @return
     */

    public static Book[] replace(Book[] mass, int index1, int index2) {
        Book tmp = mass[index1];
        mass[index1] = mass[index2];
        mass[index2] = tmp;
        return mass;
    }

    /**
     * main
     *
     * @param args
     */

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 298);
        Book maugli = new Book("Maugli", 302);
        Book journal = new Book("VOGUE", 275);
        Book manual = new Book("Manual", 731);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = maugli;
        books[2] = journal;
        books[3] = manual;

        print(books);
        replace(books, 3, 0);
        print(books);

        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            if (bks.equals(cleanCode)) {
                System.out.println(bks.getName() + " - " + bks.getPageCount());
            }
        }
    }
}
