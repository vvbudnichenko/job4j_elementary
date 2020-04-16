package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
   /* public void whenExist() {
        boolean result = Triangle.exist(3, 3, 3);
        assertThat(result, is (true));
    }*/
    public void whenNotExist() {
        boolean result = Triangle.exist(3, 3, 9);
        assertThat(result, is(true));
    }
}