package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenEnterTwoPoints() {
        Point a = new Point(3, 4);
        Point b = new Point(0, 0);
        double expected = 5.0;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.1);
    }

    @Test
    public void whenEnterThreePoints() {
        Point a = new Point(3, 4, 5);
        Point b = new Point(0, 0, 0);
        double dist = a.distance3d(b);
        double expected = 7.07;
        Assert.assertEquals(expected, dist, 0.05);
    }
}