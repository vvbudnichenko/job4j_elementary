package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
            result = first;
        } else
            if (second >= first && second >= third) {
            result = second;
        } else {
            result = third;
        }
        return result;
    }
    public static void main(String[] args) {
        int rsl = ThreeMax.max(8, 9, 10);
        System.out.println(rsl);
    }
}
