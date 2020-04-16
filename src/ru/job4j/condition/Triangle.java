package ru.job4j.condition;

import java.security.PublicKey;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        String in = ab + bc > ac && ab + ac > bc && ac + bc > ab ? "Треугольник существует" : "Треугольник не существует";
        System.out.println(in);
        return true;
    }
    public static void main(String[] args) {
        boolean ok = Triangle.exist(3, 3, 3);
    }
}
