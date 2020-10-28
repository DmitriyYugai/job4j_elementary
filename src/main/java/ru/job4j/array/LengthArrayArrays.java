package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {
                {1},
                {1, 2},
                {1, 2, 3},
                {1, 2, 3, 4}
        };
        System.out.println("Размер вложенного массива 0 равен: " + array[0].length);
        System.out.println("Размер вложенного массива 1 равен: " + array[1].length);
        System.out.println("Размер вложенного массива 2 равен: " + array[2].length);
        System.out.println("Размер вложенного массива 3 равен: " + array[3].length);
    }
}
