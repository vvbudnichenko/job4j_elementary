package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double result = (height - 100.0) * 1.15;
        return result;
    }
    public static double womanWeight(double height) {
        double rsl = (height - 110.0) * 1.15;
        return rsl;
    }
    public static void main(String[]args) {
        double man = Fit.manWeight(193.5);
        double woman = Fit.womanWeight(177.1);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is " + woman);
        }
}


