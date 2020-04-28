package ru.job4j.loop;


public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        percent *= 0.01;
        while (amount > 0) {
            for (year = 1, amount += amount * year * percent; ; year++) {
                amount -= salary;
                if (amount < 0)
                return year;
            }
        }
        return year;
    }
}



