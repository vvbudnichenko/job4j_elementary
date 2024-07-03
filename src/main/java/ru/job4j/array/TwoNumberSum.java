package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int num1 = 0;
        int num2 = 1;
        while (num2 < array.length) {
            if (array[num1] + array[num2] == target) {
                return new int[]{num1, num2};
            }
            if (array[num1] + array[num2] != target) {
                num2++;
                if (num2 == array.length) {
                    num1++;
                    num2 = num1 + 1;
                }
            }
        }
        return new int[0];
    }
}