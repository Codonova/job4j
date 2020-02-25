package ru.job4j.loop;

import org.junit.Test;

<<<<<<< HEAD
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
=======
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
>>>>>>> fa378ef6ad68e7d6d771d73ddd98351aff658e25

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
<<<<<<< HEAD
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
=======
    public void when4() {
        boolean rsl = CheckPrimeNumber.check(4);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
>>>>>>> fa378ef6ad68e7d6d771d73ddd98351aff658e25
    }
}
