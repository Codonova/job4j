package ru.job4j.array;

/**
 * ArrayChar
 * @author Ruslan Kooslapchenkov
 */

public class ArrayChar {
    /**
     * Проверят начинается ли массив на заданные символы.
     * @param word массив симовлов (слово)
     * @param pref массив символов (начальные буквы слова)
     * @return result
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
