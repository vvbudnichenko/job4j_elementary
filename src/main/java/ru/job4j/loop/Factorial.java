package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int result = 0;
        int temp = 1;
        for (int i = 1; i <= number; i++) {
            temp *= i;
            result = temp;
        }
        return result;
    }
}
