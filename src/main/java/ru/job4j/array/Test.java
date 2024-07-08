package ru.job4j.array;

import java.util.Arrays;

public class Test {
    public static int[] compress2Point(int[] array) {
        int i = 0;
        int j = 0;
        while (j < array.length) {
            if (array[i] == 0 && array[j] != 0) {
                array[i] = array[j];
                array[j] = 0;
            }
            if (array[i] != 0) {
                i++;
            }
            j++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 2, 3, 4};
        int[] renew = compress2Point(array);
        for (int i = 0; i < renew.length; i++) {
            System.out.println(renew[i]);
        }
    }

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int change = money - price;
        while (change > 0) {
            for (int i = 0; change > 0; i++) {
                if (change > 10) {
                    result[i] = coins[0];
                    change -= coins[0];
                    size++;
                } else if (change >= 5) {
                    result[i] = coins[1];
                    change -= coins[1];
                    size++;
                } else if (change >= 2) {
                    result[i] = coins[2];
                    change -= coins[2];
                    size++;
                } else {
                    result[i] = coins[3];
                    change -= coins[3];
                    size++;
                }
            }
        }
        return Arrays.copyOf(result, size);
    }
}
