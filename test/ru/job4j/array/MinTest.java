package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class MinTest {

    @Test
    public void whenFirstMinn() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 3, 5}), is(3));
    }

    @Test
    public void whenFiveMiddleMin() {
        assertThat(Min.findMin(new int[]{2, 7, 1, 1, 0}), is(0));
    }
}