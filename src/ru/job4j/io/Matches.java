package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int beginning = 11;
        System.out.println("Игра началась тяни списку");
        for (int i = 0; beginning > 0; i++) {
            String word = i % 2 == 0 ? "первый" : "второй";
            System.out.print("Ходит " + word + " игрок: ");
            int step = Integer.valueOf(input.nextLine());
            beginning -= step;
            System.out.println("Осталось " + beginning + " спичек, игра продолжается... ");
            System.out.println();
            if (beginning == 0) {
                System.out.println("Игра закончена. ");
            }
        }
    }
}
