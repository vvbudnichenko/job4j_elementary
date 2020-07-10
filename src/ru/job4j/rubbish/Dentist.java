package ru.job4j.rubbish;

public class Dentist extends Doctor {
    private String man;
    private String woman;

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