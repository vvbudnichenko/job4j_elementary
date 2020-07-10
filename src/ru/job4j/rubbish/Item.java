package ru.job4j.rubbish;

public class Item {
    public Item() {
     super();
     System.out.println("load item");
    }
    public static void main(String[] args) {
        Item item = new Item();
    }
    public class Animal extends Item {
        public Animal() {
            System.out.println("This is class Animal");
        }
    }
}
