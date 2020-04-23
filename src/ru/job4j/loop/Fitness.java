package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        if (ivan > nik) {
            return month;
        }
        ivan *= 3;
        nik *= 2;
        for (month = 0; ;) {
            month++;
            ivan *= month;
            nik *= month;
            while (ivan > nik) {
                return month;
            }
        }
    }
}

