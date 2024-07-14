package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book history = new Book("История 19 века", 561);
        Book math = new Book("Алгебра", 467);
        Book anatomy = new Book("Анатомия человека", 1564);
        Book english = new Book("Учебник английского языка", 555);
        Book coding = new Book("Clean code", 1500);
        Book[] library = new Book[5];
        library[0] = history;
        library[1] = math;
        library[2] = anatomy;
        library[3] = english;
        library[4] = coding;
        for (int index = 0; index < library.length; index++) {
            Book books = library[index];
            System.out.println(books.getName() + " – " + books.getPages());
        }
        System.out.println(System.lineSeparator() + "Переставьте местами книги с индексом 0 и 3.");
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int index = 0; index < library.length; index++) {
            Book books = library[index];
            System.out.println(books.getName() + " – " + books.getPages());
        }
        System.out.println(System.lineSeparator() +  "Добавьте цикл с выводом книг с именем \"Clean code\".");
        for (int index = 0; index < library.length; index++) {

            Book books = library[index];
            if ("Clean code".equals(books.getName())) {
                System.out.println(books.getName() + " – " + books.getPages());
            }
        }
    }
}
