package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double debtPercent = 1 + (percent / 100);
            year++;
            amount = amount * debtPercent - salary;
        }
        return year;
    }
}
