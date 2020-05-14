package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter item name: ");
        Item[] result = tracker.findByName(name);
        if (result.length != 0) {
            for (Item names : result) {
                System.out.println(names);
            }
        } else {
            System.out.println("Item doesn't find.");
        }
        return true;
    }
}
