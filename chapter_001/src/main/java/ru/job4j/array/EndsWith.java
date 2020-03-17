package ru.job4j.array;

/**
 * EndsWith
 * @author Ruslan Kooslapchenkov
 */

public class EndsWith {
    /**
     * Проверяет заканчивается ли массив на символы
     * @param word массив символов (слово)
     * @param post массив символов (последние символы)
     * @return result false or true
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            if (post[post.length - 1 - i] != word[word.length - 1 - i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
