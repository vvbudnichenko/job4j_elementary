package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;
    public void show() {
        System.out.print(this.name);
        System.out.println(this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nimi) {
        this.name = nimi;
    }
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav eats ");
        gav.eat("kotleta.");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Black eats ");
        black.eat("fish.");
        black.show();
    }
}
