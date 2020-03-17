package ru.job4j.array;

/**
 * FindLoop
 * @author Ruslan Kooslapchenkov
 */

public class FindLoop {
    /**
     * Поиск элемента по индексу
     * @param data входящий массив
     * @param el искомый элемент
     * @return rst возвращает индекс элемента
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    /**
     * Поиск элемента по индексу в указаном диапазоне
     * @param data входящий массив
     * @param el искомый элемент
     * @param start индекс с которого начинается поиск
     * @param finish индекс на котором заканчивается поиск
     * @return rst возвращает индекс элемента
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }
}
