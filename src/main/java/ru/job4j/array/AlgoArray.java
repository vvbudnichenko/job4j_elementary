package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp2 = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp2;
            }
        }
        for (int index : array) {
            System.out.println(index);
        }
    }
}
