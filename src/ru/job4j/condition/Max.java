package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(second, third);
        return first >= temp ? first : temp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(second, third, fourth);
        return first >= temp ? first : temp;
    }

}
