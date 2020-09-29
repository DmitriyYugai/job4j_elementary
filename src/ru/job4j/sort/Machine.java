package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int remainder = money - price;
        for (int coin : coins) {
            while (remainder > 0) {
                remainder = remainder - coin;
                rsl[size] = coin;
                size++;
            }
            if (remainder == 0) {
                return Arrays.copyOf(rsl, size);
            }
            size--;
            remainder = remainder + coin;
        }
        return Arrays.copyOf(rsl, 0);
    }
}
