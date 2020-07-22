package collection.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {

    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {{1, 2}, {3, 4}};
        List<Integer> expect = List.of(1, 2, 3, 4);
        List<Integer> rsl = ConvertMatrix2List.toList(input);
        assertThat(rsl, is(expect));
    }

}
