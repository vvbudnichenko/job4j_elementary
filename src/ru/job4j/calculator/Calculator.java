package ru.job4j.calculator;

public class Calculator {
   /* public static void main(String[]args){
        int one = 1;
        int two = 2;
        int onePlusTwo = one + two;
        System.out.println(" 1 " + " + " + " 2 " + " = " + onePlusTwo);
        int six = 6;
        int four = 4;
        int five = 5;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(" 6 " + " / " + " 2 " + " = " + sixDivTwo);
        System.out.println(" 5 " + " - " + " 2 " + " = " + fiveMinusTwo);
        System.out.println(" 4 " + " * " + " 2 " + " = " + fourTimeTwo);
    }*/

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[]args) {
        Calculator.plus(1, 2);
        Calculator.plus(12, 15);
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }
}

