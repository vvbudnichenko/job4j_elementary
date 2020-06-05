package ru.job4j.tracker;

public class Dentist extends Doctor {
    String man;
    String woman;

    public Dentist(String name, String surname, String education, int day, int month, int year, String diagnose) {
        super(name, surname, education, day, month, year, diagnose);
    }

    public void workWith(String forMan, String forWoman) {
        this.man = forMan;
        this.woman = forWoman;
    }

    public String getMan() {
        return man;
    }

    public String getWoman() {
        return woman;
    }
}