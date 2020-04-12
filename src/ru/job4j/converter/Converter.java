package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value1) {
        int rsl = value1 / 70;
        return rsl;
    }
    public static int rubleToDollar(int value2) {
        int rsl2 = value2 / 60;
        return rsl2;
    }
    public static void main(String[]args) {
        int rsl = Converter.rubleToEuro(140);
        System.out.println("При данном курсе валют сумма размерна на евро равна " + rsl);
        int rs2 = Converter.rubleToDollar(140);
        System.out.println("При данном курсе валют сумма размерна на доллары равна " + rs2);
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        int in2 = 140;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2 dollars. Test result : " + passed);
    }
}
