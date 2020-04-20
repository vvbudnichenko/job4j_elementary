package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        ivan *= 3;
        nik *= 2;
        int resl;
        while (ivan > nik) {
            month++;
            ivan *= month;
            nik *= month;
            }
        return month;
        }
    }