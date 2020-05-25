package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
    Machine machine = new Machine();
    int[] expected = {};
    int[] rsl = machine.change(100, 100);
    assertThat(rsl, is(expected));
    }

    @Test
    public void when75by33() {
        Machine machine = new Machine();
        int[] expected = {10, 10, 10, 10, 2};
        int[] rsl = machine.change(75, 33);
        assertThat(rsl, is(expected));
    }
}
