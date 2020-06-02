package ru.job4j.exam;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class BeginnerTest {

    @Test
    public void sameQuantity() {
        int[] fir = new int[] {1, 2, 3, 5};
        int[] sec = new int[] {5, 5, 4, 7, 8, 5, 6};
        int[] result = Beginner.sameQuantity(fir, sec);
        int[] expected = new int[] {5, 5, 4, 7};
        assertThat(result, is(expected));
    }

    @Test
    public void orderOr() {
        int[] input = new int[] {1, 2, 3, 4};
        boolean expect = true;
        boolean result = Beginner.orderOr(input);
        assertThat(result, is(expect));
    }
    @Test
    public void orderOrNot() {
        int[] input = new int[] {4, 2, 1, 3};
        boolean expect = false;
        boolean result = Beginner.orderOr(input);
        assertThat(result, is(expect));
    }
    @Test
    public void orderOrYes() {
        int[] input = new int[] {1, 3, 2, 4};
        boolean expect = false;
        boolean result = Beginner.orderOr(input);
        assertThat(result, is(expect));
    }
}
