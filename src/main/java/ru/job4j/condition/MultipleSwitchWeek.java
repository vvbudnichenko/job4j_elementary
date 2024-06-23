package ru.job4j.condition;

public class MultipleSwitchWeek {

    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресение", "Sunday" -> 7;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        System.out.println(numberOfDay("Monday"));
        System.out.println(numberOfDay("Maanantai"));
        System.out.println(numberOfDay("Суббота"));

    }
}
