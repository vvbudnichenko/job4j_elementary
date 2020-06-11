package ru.job4j.exam;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


public class BeginnerTest {

   /* @Test
    public void sameQuantity() {
        int[] fir = new int[] {5, 5, 5, 4, 5};
        int[] sec = new int[] {5, 5, 4, 5, 5};
        int[] result = Beginner.sameQuantity(fir, sec);
        int[] expected = new int[] {5, 5, 0, 0, 5};
        assertThat(result, is(expected));
    }
    @Test
    public void sameQuantity2() {
        int[] fir = new int[]{1, 2, 1, 1, 3, 0, 7};
        int[] sec = new int[]{1, 5, 4, 5, 3, 0, 7};
        int[] result = Beginner.sameQuantity(fir, sec);
        int[] expected = new int[]{1, 0, 0, 0, 3, 0, 7};
        assertThat(result, is(expected));
    }*/

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
    @Test
    public void sameQuantity13() {
        int[] fir = new int[]{1, 3};
        int[] sec = new int[]{3, 1};
        int[] result = Beginner.isSame(fir, sec);
        int[] expected = new int[]{1, 3};
        assertThat(result, is(expected));
    }
    @Test
    public void sameQuantity1() {
        int[] fir = new int[]{1, 2};
        int[] sec = new int[]{3, 1};
        int[] result = Beginner.isSame(fir, sec);
        int[] expected = new int[]{1, 0};
        assertThat(result, is(expected));
    }
    @Test
    public void sameQuantity117() {
        int[] fir = new int[]{1, 2, 5, 7};
        int[] sec = new int[]{1, 1, 3, 7};
        int[] result = Beginner.isSame(fir, sec);
        int[] expected = new int[]{1, 0, 0, 7};
        assertThat(result, is(expected));
    }
}
