package collection.list.search;

import collection.list.PriorityQueue;
import collection.list.Task;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        var pq = new PriorityQueue();
        pq.put(new Task("low", 5));
        pq.put(new Task("urgent", 1));
        pq.put(new Task("middle", 3));
        var result = pq.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
