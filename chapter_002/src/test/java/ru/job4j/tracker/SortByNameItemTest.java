package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortByNameItemTest {
    @Test
    public void whenSortItem() {
        List<Item> items = Arrays.asList(
                new Item("C"),
                new Item("A"),
                new Item("B")
        );
        Collections.sort(items, new SortByNameItem());
        List<Item> expect = Arrays.asList(
                new Item("A"),
                new Item("B"),
                new Item("C")
        );
        assertThat(String.valueOf(items), is(String.valueOf(expect)));
    }
}
