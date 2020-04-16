package ru.job4j.condition;


public class MultiMax {
    public static int max(int a, int b, int c) {
        int result = a;
        if (a > b && b > c) {
        result = a;
        } else if (b > a && b > c) {
            result = b;
        }  else if (b == a && b == c) {
            result = b;
        } else {
            result = c;
        }
        return result;
    }
    public static void main(String[] args) {
        int nm = MultiMax.max(1, 9, 8);
        System.out.println(nm);
    }
}