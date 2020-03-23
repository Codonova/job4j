package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point first = new Point(2, 2);
        Point second = new Point(4, 4);
        Point third = new Point(1, 6);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(5.000000000000003));
    }

    @Test
    public void whenNotExist() {
        Point first = new Point(2, 2);
        Point second = new Point(2, 2);
        Point third = new Point(2, 2);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(-1.0));
    }
}
