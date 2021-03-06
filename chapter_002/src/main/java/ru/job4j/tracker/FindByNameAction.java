package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter item name: ");
        List<Item> result = tracker.findByName(name);
        if (result.size() != 0) {
            for (Item names : result) {
                System.out.println(names);
            }
        } else {
            System.out.println("Item doesn't find.");
        }
        return true;
    }
}
