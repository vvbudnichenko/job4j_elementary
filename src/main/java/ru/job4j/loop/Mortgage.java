package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double debtPercent = 1 + (percent / 100);
        double debtBalance = amount;

        while (debtBalance > 0) {
            year++;
            debtBalance = debtBalance * debtPercent - salary;
        }
        return year;
    }
}
