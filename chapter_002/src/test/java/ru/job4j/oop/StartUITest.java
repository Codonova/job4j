package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.tracker.Input;
import ru.job4j.oop.tracker.Item;
import ru.job4j.oop.tracker.StartUI;
import ru.job4j.oop.tracker.Tracker;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item ("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
}
