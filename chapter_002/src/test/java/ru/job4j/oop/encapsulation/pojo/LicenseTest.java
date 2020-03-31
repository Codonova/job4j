package ru.job4j.oop.encapsulation.pojo;


import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Assert;
import org.junit.Test;

public class LicenseTest {
    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        boolean out = first.equals(second);
        boolean expected = true;
        Assert.assertEquals(out, expected);

    }
}
