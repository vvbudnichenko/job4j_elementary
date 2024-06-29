package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Alex Wood";
        names[1] = "Vlad Show";
        names[2] = "Stas Pick";
        names[3] = "Nick Good";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names[0] + System.lineSeparator() + names[1] + System.lineSeparator() + names[2] + System.lineSeparator() + names[3]);
    }
}
