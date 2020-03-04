package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
       /* for (int i = post.length-1; i >= 0; i--) {
            result = post[i] == word[word.length-1-i];
        }
        */
        for (int i = 0; i < post.length; i++) {
            if (post[post.length-1-i] != word[word.length-1-i]) {
                result = false;
                break;
            } else result = true;

        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}
