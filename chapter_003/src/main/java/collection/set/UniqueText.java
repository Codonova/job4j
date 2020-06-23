package collection.Set;

import java.util.HashSet;

public class UniqueText {
    /**
     * Метод сравнивает два текста на уникальность
     *
     * @param originText    Исходный текст
     * @param duplicateText проверяемый текст
     * @return false/true
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String o : origin) {
            check.add(o);
        }
        for (String t : text) {
            if (check.contains(t) == false) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
