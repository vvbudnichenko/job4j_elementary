package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String value = "root";
        boolean userHasAccess = StringEq.check(value);
        System.out.println(userHasAccess);
    }
}