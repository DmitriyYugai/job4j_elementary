package ru.job4j.condition;

public class Cinema1 {
    public static void permission(boolean parentAllow, boolean hasMoney) {
        if (parentAllow && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
