package ru.job4j.condition;

/**
 * DummyBot
 *
 * @author Ruslan Kooslapchenkov
 */

public class DummyBot {
    /**
     * Метод имитирует ответы бота, на вопросы пользователя.
     *
     * @param question входящий вопрос
     * @return rsl
     */
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}
