package ru.job4j.array;

public class TwoNumberSum {

    public static int[] getIndexes(int[] array, int target) {
        int left = 0;
        int right = 1;
        while (left < array.length - 1) {
            if (array[left] + array[right] == target) {
                return new int[]{left, right};
            } else if (right == array.length - 1) {
                left++;
                right = left + 1;
            } else {
                right++;
            }
        }
        return new int[0];
    }
}