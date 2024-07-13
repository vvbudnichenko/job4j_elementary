package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student first = new Student();
        first.setFirstname("Ville ");
        first.setFathersName("Jussi ");
        first.setSurname("Koskinen");
        first.setNumberGroup(523);
        first.setDateOfStart(new Date());
        System.out.println("Student has a full name: " + first.getFirstname() + first.getFathersName() + first.getSurname() + "."
                + "\nStudent in a group number: " + first.getNumberGroup() + "." +  "\nDate of registration: " + first.getDateOfStart());
    }
}