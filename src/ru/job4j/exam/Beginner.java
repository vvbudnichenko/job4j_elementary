package ru.job4j.exam;

public class Beginner {
    public static int[] sameQuantity(int[] array, int[] num) {
        int[] arr = new int[array.length];
        arr = array;
        for (int index = 0; index < array.length; index++) {
            System.out.print(arr[index]);
        }
        System.out.println();
        int[] numy = new int[array.length];
        numy = num;
        for (int i = 0; i < array.length; i++) {
            System.out.print(numy[i]);
        }
        return numy;
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