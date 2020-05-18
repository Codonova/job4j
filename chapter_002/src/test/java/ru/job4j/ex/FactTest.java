package ru.job4j.ex;

import org.junit.Test;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0() {
    int rsl = Fact.calc(-1);
    }
}
