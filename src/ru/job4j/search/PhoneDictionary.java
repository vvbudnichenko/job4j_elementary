package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person outcome : persons) {
            if (outcome.getName().contains(key) || outcome.getAddress().contains(key)
                    || outcome.getPhone().contains(key) || outcome.getSurname().contains(key)) {
            } System.out.println(result.add(outcome));
        }
        return result;
    }
}
