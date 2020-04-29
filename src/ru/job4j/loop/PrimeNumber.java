package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int num = 1; num <= finish; num++) {
            if (CheckPrimeNumber.check(num)) {
                count++;
            }
        }
        return count;
    }
}