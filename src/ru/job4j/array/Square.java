package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int val = 0; val < rst.length; val++) {
            rst[val] = val * val;
        }
        // заполнить массив через цикл элементами от 0 до bound , возведенными в квадрат
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}