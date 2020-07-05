package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean player = true;
        int total = 11;
        System.out.println("Игра началась. Всего 11 спичек.");
        while (total > 0) {
            String name = player ? "Игрок 1: " : "Игрок 2: ";
            System.out.print(name + " Тяни 1, 2 или 3 спички: ");
            int step = Integer.valueOf(input.nextLine());
            while (step < 1 || step > 3) {
                System.out.print(name + "Тяни 1, 2 или 3 спички: ");
                step = Integer.valueOf(input.nextLine());
            }
            player = !player;
            total -= step;
            System.out.println("Осталось " + total + " спичек");
            System.out.println();
            if (total == 0) {
                name = player ? "Победил Игрок 1! " : "Победил Игрок 2! ";
                System.out.println(name);
                break;
            }
        }
    }
}