package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] val = new int[5];
        for (int i = 0; i < val.length; i++) {
            val[i] = i * 2 + 3;
        }
            for (int i = 0; i < val.length; i++) {
                System.out.println(val[i]);
        }
    }
}
