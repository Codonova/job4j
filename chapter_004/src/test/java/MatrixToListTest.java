import org.junit.Test;
import streamAPI.MatrixToList;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    @Test
    public void matrixToList() {
        Integer[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> rsl = MatrixToList.convert(input);
        List<Integer> expect = List.of(1, 2, 3, 4);
        assertThat(rsl, is(expect));
    }
}