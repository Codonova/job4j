package ru.job4j.oop.encapsulation.pojo;

public class Student {
    private String name;
    private String group;
    private String dateOfReceipt;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
