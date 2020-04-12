package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl1 = Math.pow((x1 - x2), 2);
        double rsl2 = Math.pow((y1 - y2), 2);
        double rsl =  Math.sqrt(rsl1 + rsl2);
        return rsl;
    }
    public static void main(String[]args) {
        double result = Point.distance(2, 3, 0, 0);
        System.out.println("result (2, 3) to (0, 0) is " + result);
    }
}
