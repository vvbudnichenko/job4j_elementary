package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x / 2 + 3;
        return y;
    }
    public static void main(String[]args) {
        int rslt = MathFunc.func1(100);
        System.out.println(rslt);
    }
}