package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To2Then2() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax0To2Then0() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenMaxThirdValue() {
        int result = Max.max(1, 4, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenMaxForthValue() {
        int result = Max.max(1, 4, 9, 11);
        assertThat(result, is(11));
    }
}