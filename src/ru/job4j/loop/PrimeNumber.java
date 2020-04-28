package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int num = 2; num <= finish; num++) {
            if (CheckPrimeNumber.check(count++)) {
                System.out.println();
            }
        }
        return count;
    }
}