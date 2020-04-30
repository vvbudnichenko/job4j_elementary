package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] val = new int[5];
        for (int a = 0; a < val.length; a++) {
            val[a] = a;
        }
            for (int a = 0; a < val.length; a++) {
                System.out.println(a * 3 + 2);
        }
    }
}
