package ru.job4j.oop;

public class Predator extends Animal {

    public Predator() {
        super("Vasya");
        System.out.println("Predator");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
