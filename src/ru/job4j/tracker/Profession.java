package ru.job4j.tracker;
import java.time.*;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private LocalDate birthday;

    public Profession() {
    }

    public Profession(String name, String surname, String education, int day, int month, int year) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = LocalDate.of(day, month, year);
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getEducation() {
        return education;
    }
}