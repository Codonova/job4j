package collection.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    /**
     * Метод добавляет уникальные задачи в хранилище
     * @param list список задач
     * @return хранилище уникальных задач
     */
    public static Set<String> extractNumber(List<Task> list) {
        Set<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
