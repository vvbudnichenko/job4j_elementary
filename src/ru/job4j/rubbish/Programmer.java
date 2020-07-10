package ru.job4j.rubbish;

public class Programmer extends Engineer {
    private String frontend;
    private String backend;

    public Programmer(String name, String surname, String education, int day, int month, int year, String diagnose) {
        super(name, surname, education, day, month, year, diagnose);
    }

    public void showing(String frontend, String backend) {
        this.frontend = frontend;
        this.backend = backend;
    }
    public String getFrontend() {
        return frontend;
    }
    public String getBackend() {
        return backend;
    }
}