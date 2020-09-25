package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<>();
        data.add("Petr");
        data.add("Ivan");
        data.add("Stepan");
        for(Object outcome : data) {
            System.out.println("In a list exists the following user: " + outcome);
        }
    }
}
