package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height){
        double result = height * 1.15;
        return result;
    }
    public static double womanWeight(double height){
        double rsl = height * 1.15;
        return rsl;
    }
    public static void main(String[]args){
        double man = Fit.manWeight(100.0);
        double woman = Fit.womanWeight(100.0);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 100 is " + woman);
        }
}


