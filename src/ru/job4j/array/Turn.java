package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int index = array.length;
            int temp;
            for (i = 0; i < index / 2; i++) {
                temp = array[index - i - 1];
                array[index - i - 1] = array[i];
                array[i] = temp;
            }


        }
        return array;
    }
}
