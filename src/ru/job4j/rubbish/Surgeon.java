package ru.job4j.rubbish;

public class Surgeon extends Doctor {
    private boolean operation;
    private boolean inspection;

    public Surgeon(String name, String surname, String education, int day, int month, int year, String diagnose) {
        super(name, surname, education, day, month, year, diagnose);

    }
    public void showing(boolean operation, boolean inspection) {
        this.operation = operation;
        this.inspection = inspection;
    }
    public boolean getOparation() {
        return true;
    }
    public boolean getInpection() {
        return true;
    }
}