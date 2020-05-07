package ru.job4j.oop.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        Item item;
        Item[] items;
        String name;
        String id;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            switch (select) {
                case 0:
                    System.out.println("=== Create a new Item ====");
                    name = input.askStr("Enter name: ");
                    item = new Item(name);
                    tracker.add(item);
                    break;
                case 1:
                    System.out.println("=== All items ===");
                    items = tracker.findAll();
                    for (Item names :
                            items) {
                        System.out.println(names);
                    }
                    break;
                case 2:
                    System.out.println("=== Edit ===");
                    id = input.askStr("Enter item id: ");
                    name = input.askStr("Enter new item name: ");
                    if (tracker.replace(id, new Item(name))) {
                        System.out.println("Edit successful!");
                    } else {
                        System.out.println("Item doesn't find.");
                    }
                    break;
                case 3:
                    System.out.println("=== Delete ===");
                    id = input.askStr("Enter item id: ");
                    if (tracker.delete(id)) {
                        System.out.println("Delete successful!");
                    } else {
                        System.out.println("Item doesn't find.");
                    }
                    break;
                case 4:
                    System.out.println("=== Find by id ===");
                    id = input.askStr("Enter item id: ");
                    item = tracker.findById(id);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.print("Item doesn't find.");
                    }
                    break;
                case 5:
                    System.out.println("=== Find items by name ===");
                    name = input.askStr("Enter item name: ");
                    Item[] result = tracker.findByName(name);
                    if (result.length != 0) {
                        for (Item names : result) {
                            System.out.println(names);
                        }
                    } else {
                        System.out.println("Item doesn't find.");
                    }
                    break;
                case 6:
                    run = false;
                    break;
            }
        }

    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
