package ru.job4j.oop;

public class Animal {

    public Animal() {
        System.out.println("Animal");
    }

    public Animal(String name) {
        System.out.println("Animal " + "name is " + name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
    }
}
