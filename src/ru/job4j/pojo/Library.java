package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Дурак", 200);
        Book two = new Book("Clean code", 1390);
        Book three = new Book("Доктор Дулитл", 165);
        Book four = new Book("БСЭ", 1654);

        Book[] liba = new Book[4];
        liba[0] = one;
        liba[1] = two;
        liba[2] = three;
        liba[3] = four;
        for (int index = 0; index < liba.length; index++) {
            Book ebook = liba[index];
            System.out.println(ebook.getName() + " " + ebook.getNumPages());
        }
        System.out.println();
        Book temp = liba[0];
        liba[0] = liba[3];
        liba[3] = temp;
        for (int index = 0; index < liba.length; index++) {
            Book ebook = liba[index];
            System.out.println(ebook.getName() + " " + ebook.getNumPages());
        }
        System.out.println();
        System.out.println("If this book is \"Clean code\" than code is true");
        for (int index = 0; index < liba.length; index++) {
            Book ebook = liba[index];
            if (ebook.getName().equals("Clean code")) {
                System.out.println(ebook.getName() + " " + ebook.getNumPages());
            }
        }
    }
}
