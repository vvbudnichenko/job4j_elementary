package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Richard Beans");
        student.setNumGroup(1459);
        student.setBeginning(new Date());
        System.out.println(student.getFullName() + " was accepted to University to the group number " + student.getNumGroup());
    }
}
