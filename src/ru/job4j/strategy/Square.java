package ru.job4j.strategy;

import ru.job4j.tracker.Input;

public class Square implements Shape{
    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return    " _____" + ln
                + "|     | " + ln
                + "|_____|" + ln;
    }
    public static void main(String[] args) {
        System.out.println(new Triangle().draw());
    }
}
