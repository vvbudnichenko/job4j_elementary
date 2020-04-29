package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = num > 1;
        for (int a = 2; a < num; a++) {
            if (num % a == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}





