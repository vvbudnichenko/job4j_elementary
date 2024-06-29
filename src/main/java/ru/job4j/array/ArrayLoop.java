package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayOfFive = new int[5];
        for (int i = 0; i < arrayOfFive.length; i++) {
            arrayOfFive[i] = i * 2 + 3;
        }
        for (int number : arrayOfFive) {
            System.out.println(number);
        }
    }
}