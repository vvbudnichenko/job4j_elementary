package ru.job4j.inheritance;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(position);
    }
    public String getProperties(String key) {
        return seach(key);
    }
    public String seach(String key) {
        return key;
    }
}
