package ru.job4j.converter;

/**
 * Converter
 * @author Ruslan Kooslapchenkov
 */

public class Converter {

    /**
     * Конвертирует из рубля в евро
     * @param value Рубли
     * @return rsl
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * Коневртирует из рубля в доллар
     * @param value Рубли
     * @return rsl
     */

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * Конвертирует из доллара в рубль
     * @param value доллар
     * @return rsl
     */
    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    /**
     * Конвертирует из евро в рубль
     * @param value Евро
     * @return rsl
     */
    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    /**
     * main
     * @param args args
     */
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollars.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 3. Test result : " + passed);
    }
}
