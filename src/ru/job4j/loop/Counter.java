package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }
        return sum;
    }
}
