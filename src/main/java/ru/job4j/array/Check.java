package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean temp = data[0];
        for (int i = 1; i < data.length; i++) {
            if (temp != data[i]) {
                return false;
            }
        }
        return true;
    }
}
