package ru.job4j.spring.di;


public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.askInt("2");
        ui.askStr("Как дела?");

    }
}
