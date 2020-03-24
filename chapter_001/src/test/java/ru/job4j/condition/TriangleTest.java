package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point first = new Point(2, 2);
        Point second = new Point(4, 4);
        Point third = new Point(1, 6);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertEquals(result, 5.0, 0.1);
    }

    @Test
    public void whenNotExist() {
        Point first = new Point(2, 2);
        Point second = new Point(2, 2);
        Point third = new Point(2, 2);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertEquals(result, -1, 0.1);
    }
}
