package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        boolean th = true;
        int month = 0;
        if (ivan > nik) {
            return month;
        }
        ivan *= 3;
        nik *= 2;
        while (th) {
            month++;
            ivan *= month;
            nik *= month;
            if (ivan > nik) {
                return month;
            }
        }
        return month;
    }
}



