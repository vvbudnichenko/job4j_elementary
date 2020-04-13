package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double result = (height - 100.0) * 1.15;
        return result;
    }
    public static double womanWeight(double height) {
        double rslt = (height - 110.0) * 1.15;
        return rslt;
    }
    public static void main(String[]args) {
        double man = Fit.manWeight(190.0);
        double woman = Fit.womanWeight(170.0);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is " + woman);
        }
}


