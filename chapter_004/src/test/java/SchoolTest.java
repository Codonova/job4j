import org.junit.Test;
import streamAPI.School;
import streamAPI.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class SchoolTest {
    @Test
    public void whenClassA() {
        Predicate<Student> minA = s -> s.getScore() >= 70;
        Predicate<Student> maxA = s -> s.getScore() <= 100;
        Predicate<Student> combine = minA.and(maxA);
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, combine);
        List<Student> expect = List.of(
                new Student("Kolobkov", 79),
                new Student("Abramov", 82)
        );
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenClassB() {
        Predicate<Student> minB = s -> s.getScore() >= 50;
        Predicate<Student> maxB = s -> s.getScore() <= 70;
        Predicate<Student> combine = minB.and(maxB);
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, combine);
        List<Student> expect = List.of(
                new Student("Ivanov", 63)
        );
        assertThat(expect, is(rsl));
    }

    @Test
    public void whenClassC() {
        Predicate<Student> minB = s -> s.getScore() >= 0;
        Predicate<Student> maxB = s -> s.getScore() <= 50;
        Predicate<Student> combine = minB.and(maxB);
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, combine);
        List<Student> expect = List.of(
                new Student("Kurbatov", 33)
        );
        assertThat(expect, is(rsl));
    }
}