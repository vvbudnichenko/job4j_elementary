package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectTest {

    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelect.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFromThree() {
        int[] input = new int[]{7, 4, 3, 6, 5};
        int[] result = SortSelect.sort(input);
        int[] expect = new int[]{3, 4, 5, 6, 7};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSortFromTwo() {
        int[] input = new int[]{4, 2, 3};
        int[] result = SortSelect.sort(input);
        int[] expect = new int[]{2, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFromFive() {
        int[] input = new int[]{5, 7, 6, 10};
        int[] result = SortSelect.sort(input);
        int[] expect = new int[]{5, 6, 7, 10};
        assertThat(result, is(expect));
    }
}
