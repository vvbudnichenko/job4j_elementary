package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To5Then5() {
        int left = 3;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst5Second4Third3Then5() {
        int first = 5;
        int second = 4;
        int third = 3;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst3Second4Third5Then5() {
        int first = 3;
        int second = 4;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst1Second4Third2Then4() {
        int first = 1;
        int second = 4;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst1Second4Third2Fort8Then8() {
        int first = 1;
        int second = 4;
        int third = 2;
        int forth = 8;
        int result = Max.max(first, second, third, forth);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }
}