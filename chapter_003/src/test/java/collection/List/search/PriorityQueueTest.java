package collection.List.search;

import collection.List.PriorityQueue;
import collection.List.Task;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("low", 5));
        pq.put(new Task("urgent", 1));
        pq.put(new Task("middle", 3));
        Task result = pq.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
