
package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nick) {
        int month = 0;
        while (nick > ivan) {
            ivan *= 3;
            nick *= 2;
            month++;
            ivan *= month;
            nick *= month;
        }
        return month;
    }
}





