package ru.job4j.oop.tracker;

import java.util.Scanner;

public class StartUI {

    /**
     * Возвращает индекс искомого элемента.
     * @param name
     * @param items
     * @return индекс
     */

    public int index(String name, Item[] items) {
        int rsl = -1;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName().equals(name)) {
                rsl = i;
            }
        }
        return rsl;
    }

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ===");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println("name: " + items[i].getName() + ", id: " + items[i].getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit ===");
                System.out.print("Enter item name: ");
                String id = "";
                String name = scanner.nextLine();
                Item[] find = tracker.findByName(name);
                if (index(name, find) != -1) {
                    System.out.print("Enter new name: ");
                    Item item = new Item(scanner.nextLine());
                    for (int i = 0; i < find.length; i++) {
                        id = find[i].getId();
                        tracker.replace(id, item);
                        System.out.println("Edit successful!");
                    }
                } else {
                    System.out.println("Item doesn't find.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete ===");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                Item[] find = tracker.findByName(name);
                if (index(name, find) != -1) {
                    String id = find[index(name, find)].getId();
                    tracker.delete(id);
                    System.out.println("Delete successful!");
                } else {
                    System.out.println("Item doesn't find.");
                }
            } else if (select == 4) {
                System.out.println("=== Find by id ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                System.out.println("name: " + tracker.findById(id).getName() + " id: " + tracker.findById(id).getId());
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter item name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                Item[] result = tracker.findByName(item.getName());
                for (int i = 0; i < result.length; i++) {
                    System.out.println("name: " + result[i].getName() + ", id: " + result[i].getId());
                }
            } else if (select == 0) {
                run = false;
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
