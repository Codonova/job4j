package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit ===");
        String id = input.askStr("Enter item id: ");
        String name = input.askStr("Enter new item name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Edit successful!");
        } else {
            System.out.println("Item doesn't find.");
        }
        return true;
    }
}
