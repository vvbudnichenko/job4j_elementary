package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        if (number == 1) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int a = 3; a * a <= number; a++) {
            if (number % a == 0) {
                return false;
            } else {
                    break;
                }
            }
        return true;
        }
    }





