package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
   public void whenExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 1.5;
        assertThat(rsl, is(expected));
    }
}