package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                System.out.println(number);
            } else if (number / finish % 2 == 0) continue;
            finish -= 1;
            count = finish;
        }
        return count;
    }
}
