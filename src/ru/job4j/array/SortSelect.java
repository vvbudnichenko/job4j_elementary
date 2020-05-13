package ru.job4j.array;

public class SortSelect {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
                int min = MinDiapason.findMin(data, i, data.length - 1);
                int index = FindLoop.indexOf(data, min, i, data.length - 1);
                int ind = SwitchArray.swap(data, i, data.length - 1);

        }
        return data;
    }
}

