package ru.job4j.ex;

public class FindElement {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int i = 0;
        for (String name : value) {
            if (key.equals(name)) {
                rsl = i;
            }
            i++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"Oleg", "Artur", "Anton"};
        String key = "Konan";
        try {
          indexOf(value, key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
