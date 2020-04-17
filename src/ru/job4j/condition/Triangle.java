package ru.job4j.condition;

import java.security.PublicKey;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && ab + ac > bc && ac + bc > ab;
    }
    public static void main(String[] args) {
        boolean ok = Triangle.exist(3, 3, 3);
        System.out.println(ok);
    }
}
