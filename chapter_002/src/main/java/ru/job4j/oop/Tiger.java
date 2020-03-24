package ru.job4j.oop;

public class Tiger extends Predator {
    private String color;

    public Tiger() {
        System.out.println("Tiger");
    }

    public Tiger(String color) {
        super("Cat");
        this.color = color;
        System.out.println("Tiger color is " + color);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Orange");
    }
}
