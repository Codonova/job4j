package ru.job4j.oop;

public class Predator extends Animal {
    private String type;

    public Predator() {
        System.out.println("Predator");
    }

    public Predator(String type) {
        super("Vasya");
        this.type = type;
        System.out.println("Predator type is " + type);
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
    }
}
