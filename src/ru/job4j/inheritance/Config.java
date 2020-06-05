package ru.job4j.inheritance;

public class Config {
    private String name; // Полю присвоен модификатор private, вместо default
    private int position; // Полю присвоен модификатор private, вместо default
    private String[] properties; // Полю присвоен модификатор private, вместо default

    public Config(String name) {
        this.name = name;
    }
    public void print() { // Методу присвоен модификатор public, вместо default
        System.out.println(position);
    }
    public String getProperties(String key) { // Методу присвоен модификатор public, вместо protected
        return seach(key);
    }
    private String seach(String key) {
        return key;
    }
}
