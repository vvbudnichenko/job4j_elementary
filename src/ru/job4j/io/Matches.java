package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 11;
        int step;
        System.out.println("Игра началась тяни списку");
        while (true) {
            System.out.print("Ходит первый игрок: ");
            do {
                step = Integer.valueOf(input.nextLine());
            } while (step > 3 || step < 1);
            total -= step;
            if (total <= 0) {
                System.out.println("Победил первый игрок");
                break;
            }
            System.out.println("Осталось " + total);
            System.out.print("Ходит второй игрок: ");
            do {
                step = Integer.valueOf(input.nextLine());
            } while (step > 3 || step < 1);
            total -= step;
            if (total <= 0) {
                System.out.println("Победил второй игрок");
                break;
            }
            System.out.println("Осталось " + total);
        }
    }
}