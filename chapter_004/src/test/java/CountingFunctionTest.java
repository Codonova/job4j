import labmda.CountingFunction;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CountingFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = CountingFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = CountingFunction.diapason(3, 6, x -> Math.pow((2 * x), (2)) + (2 * x) + 3);
        List<Double> expected = Arrays.asList(45D, 75D, 113D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = CountingFunction.diapason(1, 4, x -> Math.pow(5, x));
        List<Double> expected = Arrays.asList(5D, 25D, 125D);
        assertThat(result, is(expected));
    }
}
