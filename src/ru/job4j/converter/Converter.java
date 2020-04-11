package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value1){
        int rsl = value1 / 70;
        return rsl;
    }
    public static int rubleToDollar(int value2){
        int rsl2 = value2 / 60;
        return rsl2;
    }
    public static void main(String[]args){
        int rub = 7000;
        int rsl = Converter.rubleToEuro(rub);
        System.out.println("При данном курсе валют сумма размерна на евро равна " + rsl);
        int rs2 = Converter.rubleToDollar(rub);
        System.out.println("При данном курсе валют сумма размерна на евро равна " + rs2);
    }
}
