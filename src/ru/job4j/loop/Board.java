package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        int result = width * height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                String in = (i + j) % 2 == 0 ? "X" : " ";
                System.out.print(in);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
    }
}


