package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceOne() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        /*
        int inX1 = 0;
        int inY1 = 0;
        int inX2 = 2;
        int inY2 = 0;
        */
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distanceTwo() {
        Point a = new Point(5, 3);
        Point b = new Point(8, 9);
        /*
        int inX1 = 5;
        int inY1 = 3;
        int inX2 = 8;
        int inY2 = 9;
        */
        double expected = 6.7;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(3, 5, 2);
        Point b = new Point(4, 7, 8);
        double expected = 6.4;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }

}
