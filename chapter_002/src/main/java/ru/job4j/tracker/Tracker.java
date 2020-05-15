package ru.job4j.tracker;

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
     *
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
     * Поиск по уникальному коду заявки
     *
     * @param id
     * @return возращает уникальный код заявки, если не находит возвращает null.
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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
     * Метод изменяет имя завяки.
     * @param id
     * @param item
     * @return
     */

    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            return true;
        }
        return false;
    }


    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
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
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
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