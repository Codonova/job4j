package ru.job4j.oop.encapsulation.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ruslan");
        student.setGroup("B-3");
        student.setDateOfReceipt("20.09.2020");

        System.out.println(student.getName() + " form group - " + student.getGroup() + System.lineSeparator() + "date of receipt - " + student.getDateOfReceipt());
    }
}
