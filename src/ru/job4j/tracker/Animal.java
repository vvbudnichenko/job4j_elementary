package ru.job4j.tracker;

public class Animal {
    public Animal() {
    }
    public Animal(String name) {
    }
    public static class Predator extends Animal {
        public Predator(String name) {
            super(name);
        }
    }
    public static class Tiger extends Animal {
        public Tiger(String name) {
            super(name);
        }
    }
    public static void main(String[] args) {
    }
}
