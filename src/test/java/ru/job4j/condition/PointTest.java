package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to24then3dot16() {
        double expected = 3.16;
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to00then0() {
        double expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when33to99then8dot48() {
        double expected = 8.48;
        Point a = new Point(3, 3);
        Point b = new Point(9, 9);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus2toMinus3Minus4then2dot82() {
        double expected = 2.82;
        Point a = new Point(-1, -2);
        Point b = new Point(-3, -4);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenFirstPoint333SecondPoint990then9() {
        double expected = 9.0;
        Point a = new Point(3, 3, 3);
        Point b = new Point(9, 9, 0);
        double output = a.distance3D(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenFirstPoint001SecondPoint789then13dot30() {
        double expected = 13.30;
        Point a = new Point(0, 0, 1);
        Point b = new Point(7, 8, 9);
        double output = a.distance3D(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}