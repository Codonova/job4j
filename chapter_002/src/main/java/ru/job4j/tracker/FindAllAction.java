package ru.job4j.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== All items ===");
        for (Item names : tracker.findAll()) {
            System.out.println(names);
        }
        return true;
    }
}
