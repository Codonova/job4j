package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReverseSortByNameItemTest {
    @Test
    public void whenReverseSortItem() {
        List<Item> items = Arrays.asList(
                new Item("C"),
                new Item("A"),
                new Item("B")
        );
        Collections.sort(items, new ReverseSortByName());
        List<Item> expect = Arrays.asList(
                new Item("C"),
                new Item("B"),
                new Item("A")
        );
        assertThat(items, is(expect));
    }
}
