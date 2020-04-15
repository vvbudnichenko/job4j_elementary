package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        boolean gg = " ".equals(rsl);
        return rsl;
    }
    public static void main(String[] args) {
        String nn = " ";
        String in =  DummyBot.answer(nn);
        System.out.println(in);
    }
}