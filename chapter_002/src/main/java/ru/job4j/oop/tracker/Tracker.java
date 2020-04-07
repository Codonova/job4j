package ru.job4j.oop.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод возвращает копию массива без пустых значений.
     *
     * @return массив без пустых ячеек
     */

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод ищет имена в массиве
     * @param key
     * @return Массив имен
     */

    public Item[] findByName(String key) {
        Item[] names = new Item[position];
        int size = 0;
        for (int i = 0; i < names.length; i++) {
            if (items[i].getName().equals(key)) {
                names[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(names, size);
    }

    /**
     * ПОиск по уникальному коду заявки
     * @param id
     * @return возращает уникальный код заявки, если не находит возвращает null.
     */
    public Item findById(String id) {
        Item rsl = null;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                rsl = items[i];
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
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
