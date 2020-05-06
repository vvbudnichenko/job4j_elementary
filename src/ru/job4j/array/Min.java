package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = 0;
        for (int index = 1; index < array.length; index++) {
            if (array[index] > array[index - 1]) {
                min = index - 1;
                break;
            } else if (array[index] <= array[index - 1]) {
               min = index;
            }
        }
        return min;
    }
}
