package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MInTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void whenThird() {
        assertThat(Min.findMin(new int[]{7, 3, 1, 9}), is(1));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }

}
