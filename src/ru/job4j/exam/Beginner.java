package ru.job4j.exam;

public class Beginner {
    public static int[] sameQuantity(int[] array, int[] num) {
        int[] arr = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            if (array[index] == num[index]) {
                arr[index] = array[index];
                System.out.println(arr[index]);
            } else if (array[index] != num[index]) {
                continue;
            }
        }
        return arr;
    }

    public static boolean orderOr(int[] arrays) {
        boolean rsl = true;
        for (int i = 0; i < arrays.length - 1; i++) {
            if (arrays[i] > arrays[i + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
