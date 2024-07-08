package ru.job4j.calculator;

public class Fit {

    /**
     * Calculate ideal weight for a man based on height.
     *
     * @param height Height in centimeters.
     * @return Ideal weight in kilograms.
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Calculate ideal weight for a woman based on height.
     *
     * @param height Height in centimeters.
     * @return Ideal weight in kilograms.
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}