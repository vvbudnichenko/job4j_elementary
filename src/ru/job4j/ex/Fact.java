package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        try {
            System.out.println(calc(-1));
        } catch (IllegalArgumentException ex) {
            System.err.println("There is no result! " + ex);
        }
    }

    public static int calc(int n) throws IllegalArgumentException {
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        if (n < 0) {
            throw new IllegalArgumentException("Errors happen");
        }
        return rsl;
    }
}