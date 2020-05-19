package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        eng = "\"Неизвестное слово.\" " + eng + ".";
        return eng;
    }
    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String rsl = peppy.engToRus("Nopea");
        System.out.println(rsl);
    }
}
