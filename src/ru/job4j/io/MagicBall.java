package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        System.out.print("Чтобы получить ответ, выберите число 0 или 1: ");
        String question2 = input.nextLine();
        int reply = new Random().nextInt(3);
        if (reply == 0) {
            System.out.println("Да");
        } else if (reply == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
