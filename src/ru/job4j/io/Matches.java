package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean player = true;
        int total = 11;
        System.out.println("Игра началась. Всего 11 спичек.");
        while (total > 0) {
            System.out.print("Тяни 1, 2 или 3 спички: ");
            int step = Integer.valueOf(input.nextLine());
            player = !player;
            if (step > 3 || step < 1) {
                continue;
            } else if (total - step <= 0) {
                if (player) {
                    System.out.println("Первый игрок поведил!");
                } else {
                    System.out.println("Второй игрок победил!");
                }
            }
            total -= step;
            System.out.println("Осталось " + total + " спичек");
            System.out.println();
        }
    }
}