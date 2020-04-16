package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenABiggerThenB() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 9, 8);
        assertThat(result, is(9));
    }

    @Test
    public void whenBBiggerThenC() {
        MultiMax check = new MultiMax();
        int result = check.max(10, 100, 1);
        assertThat(result, is(100));
    }

    @Test
    public void whenCBiggeThenA() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 10, 100);
        assertThat(result, is(100));
    }

    @Test
    public void whenEqualThen() {
        MultiMax check = new MultiMax();
        int result = check.max(100, 100, 100);
        assertThat(result, is(100));
    }
}