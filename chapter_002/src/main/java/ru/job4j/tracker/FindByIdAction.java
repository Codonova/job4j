package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find by id ===");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.print("Item doesn't find.");
        }
        return true;
    }
}
