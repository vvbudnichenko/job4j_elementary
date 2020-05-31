package ru.job4j.tracker;

public class Animal {
    public Animal() {
    }

    public static class Predator extends Animal {
        public Predator() {
        }
    }

    public static class Tiger extends Animal {
        public Tiger() {
        }
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal);
        Predator predy = new Predator();
        System.out.println(predy);
        Tiger tigy = new Tiger();
        System.out.println(tigy);
    }
}
