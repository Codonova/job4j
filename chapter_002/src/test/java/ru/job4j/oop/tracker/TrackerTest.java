package ru.job4j.oop.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = new Item("Solo");
        tracker.add(item);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result, is(new Item[] {item}));
    }

    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item item = new Item("Koko");
        Item item1 = new Item("Lala");
        Item[] items = {item, item1};
        tracker.add(item);
        tracker.add(item1);
        Item[] result = tracker.findAll();
        assertThat(result, is(items));
    }

    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("Koshka");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getId(), is(item.getId()));
    }

}
