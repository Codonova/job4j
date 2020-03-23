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
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenEqualsThen2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2To1Then3() {
        int result = Max.max(2, 3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax6To2To4To1Then4() {
        int result = Max.max(3, 2, 4, 6);
        assertThat(result, is(6));
    }
}
