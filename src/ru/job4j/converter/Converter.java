package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70; /* формула перевода рублей в евро. */
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int inRubleToEuro = 140;
        int expectedRubleToEuro = 2;
        int outRubleToEuro = Converter.rubleToEuro(inRubleToEuro);
        boolean passedRubleToEuro = expectedRubleToEuro == outRubleToEuro;
        System.out.println("140 rubles are 2 euro. Test result: " + passedRubleToEuro);
        int inRubleToDollar = 120;
        int expectedRubleToDollar = 2;
        int outRubleToDollar = Converter.rubleToDollar(inRubleToDollar);
        boolean passedRubleToDollar = expectedRubleToDollar == outRubleToDollar;
        System.out.println("120 rubles are 2 dollars. Test result: " + passedRubleToDollar);
    }

}
