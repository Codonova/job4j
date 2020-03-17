package ru.job4j.array;

/**
 * Check
 * @author Ruslan Kooslapchenkov
 */

public class Check {
    /**
     * Проверяет массив на одинаковые значение, если одно отличается то возваращет false
     * @param data массив boolean
     * @return result массив
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
