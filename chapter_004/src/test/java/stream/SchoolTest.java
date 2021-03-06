package stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void whenClassA() {
        List<Student> input = List.of(
                new Student("Kolobkov", 70),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, s -> s.getScore() >= 70 && s.getScore() <= 100);
        List<Student> expect = List.of(
                new Student("Kolobkov", 70),
                new Student("Abramov", 82)
        );
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenClassB() {
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Ivanov", 50),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        List<Student> rsl = School.collect(input, s -> s.getScore() >= 50 && s.getScore() < 70);
        List<Student> expect = List.of(
                new Student("Ivanov", 50)
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

    @Test
    public void convertListToMap() {
        List<Student> input = List.of(
                new Student("Kolobkov", 79),
                new Student("Kolobkov", 55),
                new Student("Ivanov", 63),
                new Student("Abramov", 82),
                new Student("Kurbatov", 33)
        );
        Map<String, Student> rsl = School.collectToMap(input);
        assertThat(rsl.get("Kolobkov"), is(new Student("Kolobkov", 55)));
    }
}