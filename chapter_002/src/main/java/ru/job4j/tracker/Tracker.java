package ru.job4j.tracker;

import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<Item>();

    /**
     * Метод возвращает копию массива без пустых значений.
     *
     * @return массив без пустых ячеек
     */

    public List<Item> findAll() {
        return this.items;
    }

    /**
     * Метод ищет имена в массиве
     *
     * @param key
     * @return Массив имен
     */

    public List<Item> findByName(String key) {
       // Item[] names = new Item[position];
        ArrayList<Item> names = new ArrayList<>();
        for (Item name : this.items) {
            if (name.getName().equals(key)) {
                names.add(name);
            }
        }
        return names;
    }

    /**
     * Поиск по уникальному коду заявки
     *
     * @param id
     * @return возращает уникальный код заявки, если не находит возвращает null.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items.add(item);
        return item;
    }


    /**
     * Метод изменяет имя завяки.
     * @param id
     * @param item
     * @return
     */

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            return true;
        }
        return false;
    }


    private int indexOf(String id) {
        int rsl = -1;
        int index = 0;
        for (Item item : this.items) {
            if (item.getId().equals(id)) {
                rsl = index;
                break;
            }
            index++;
        }
        return rsl;
    }


    /**
     * Метод удаляет заявку.
     * @param id
     * @return
     */

    public boolean delete(String id) {
        int index = indexOf(id);
        if (index != -1) {
           this.items.remove(index);
            return true;
        }
        return false;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
