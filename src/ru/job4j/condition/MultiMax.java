package ru.job4j.condition;


public class MultiMax {
    public static int max(int a, int b, int c) {
        return (a >= b && a >= c) ? a : ((b > c) ? b : c);
    }
    public static void main(String[] args) {
        int nm = MultiMax.max(12, 31, 42);
        System.out.println(nm);
    }
}
