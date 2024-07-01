package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int element) {
        int result = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int indexInRange(int[] data, int element, int start, int finish) {
        if (data.length == 0 || start > finish || start < 0 || finish >= data.length) {
            return -1;
        }
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
