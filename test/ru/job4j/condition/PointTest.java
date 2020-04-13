package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenEnterPointsThenLenght() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 0;
        int y2 = 0;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}