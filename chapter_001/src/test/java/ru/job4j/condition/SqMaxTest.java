package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void errorFindFirst() {
        SqMax check = new SqMax();
        int result = check.max(6, 4, 7,5);
        assertThat(result, is(7));
    }

    @Test
    public void errorFindSecond() {
        SqMax check = new SqMax();
        int result = check.max(6, 8, 10,5);
        assertThat(result, is(10));
    }

}
