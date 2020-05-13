package ru.job4j.tracker;


public class StartUI {
    /**
     * Создает заявку
     *
     * @param input
     * @param tracker
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * Показывает все созданные заявки
     *
     * @param tracker
     */
    public static void showItems(Tracker tracker) {
        System.out.println("=== All items ===");
        Item[] items = tracker.findAll();
        for (Item names
                : items) {
            System.out.println(names);
        }
    }

    /**
     * Редактирует заявку
     *
     * @param input
     * @param tracker
     */
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit ===");
        String id = input.askStr("Enter item id: ");
        String name = input.askStr("Enter new item name: ");
        if (tracker.replace(id, new Item(name))) {
            System.out.println("Edit successful!");
        } else {
            System.out.println("Item doesn't find.");
        }
    }

    /**
     * Удаляет заявку
     *
     * @param input
     * @param tracker
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete ===");
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("Delete successful!");
        } else {
            System.out.println("Item doesn't find.");
        }
    }

    /**
     * Поиск по id заявки
     *
     * @param input
     * @param tracker
     */
    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find by id ===");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.print("Item doesn't find.");
        }
    }

    /**
     * Поиск по имени заявки
     *
     * @param input
     * @param tracker
     */
    public static void findByName(Input input, Tracker tracker) {
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
    }

    /**
     * Взаимодействие пользователя с меню.
     *
     * @param input
     * @param tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            switch (select) {
                case 0:
                    StartUI.createItem(input, tracker);
                    break;
                case 1:
                    StartUI.showItems(tracker);
                    break;
                case 2:
                    StartUI.editItem(input, tracker);
                    break;
                case 3:
                    StartUI.deleteItem(input, tracker);
                    break;
                case 4:
                    StartUI.findById(input, tracker);
                    break;
                case 5:
                    StartUI.findByName(input, tracker);
                    break;
                case 6:
                    run = false;
                    break;
                default:
            }
        }

    }

    /**
     * Метод выводит меню
     */
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
