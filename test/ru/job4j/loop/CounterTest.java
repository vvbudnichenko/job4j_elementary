package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenAllthenSum() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenEventhenSum() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}