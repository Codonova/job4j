import org.junit.Test;
import streamAPI.School;
import streamAPI.Student;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenClassA() {
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, s -> s.getScore() > 70 && s.getScore() < 100);
        List<Student> expect = List.of(
                new Student("Kolobkov", 79),
                new Student("Abramov", 82)
        );
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenClassB() {
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, s -> s.getScore() > 50 && s.getScore() < 70);
        List<Student> expect = List.of(
                new Student("Ivanov", 63)
        );
        assertThat(expect, is(rsl));
    }

    @Test
    public void whenClassC() {
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, s -> s.getScore() > 0 && s.getScore() < 50);
        List<Student> expect = List.of(
                new Student("Kurbatov", 33)
        );
        assertThat(expect, is(rsl));
    }
}