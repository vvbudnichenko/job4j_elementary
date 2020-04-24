package ru.job4j.loop;


public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount < salary) {
            for (year = 1; ; year++) {
                int balance = (int) (amount * year + (amount * year * percent * 0.01));
                    int res = balance - salary;
                    amount = res;
                    if (res <= 0) {
                        return year;
                }
            }
        }
        return year;
    }
}



