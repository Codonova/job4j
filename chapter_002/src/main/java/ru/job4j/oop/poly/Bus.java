package ru.job4j.oop.poly;

public class Bus implements Transport {

    @Override
    public void ride() {
        System.out.println("ride");
    }

    @Override
    public void pass(int countPass) {
        System.out.println(countPass);
    }

    @Override
    public double fill(double gasCount) {
        double price = 2;
        return price *= gasCount;
    }
}
