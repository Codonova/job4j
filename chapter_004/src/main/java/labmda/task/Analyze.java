package labmda.task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Получение статистики аттестатов.
 * @author Ruslan Kooslapchenkov
 */
public class Analyze {

    /**
     * Вычисляет общий средний балл Всех учеников по всем предметам.
     *
     * @param stream
     * @return средний балл
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap(e -> e.getSubjects().stream())
                .mapToDouble(Subject::getScore)
                .average()
                .orElse(Double.NaN);
    }

    /**
     * Вычисляет средний бал каждого ученика по всем его предметам.
     *
     * @param stream
     * @return Список Tuple (имя уеника, средний балл)
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(), s.getSubjects()
                        .stream()
                        .mapToDouble(e -> e.getScore()).average().getAsDouble()))
                .collect(Collectors.toList());
    }

    /**
     * Вычисляет средний балл по каждому предмету всех учеников.
     *
     * @param stream
     * @return Список Tuple (название предмета, средний балл)
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream().sorted((l, r) -> r.getKey().compareTo(l.getKey()))
                .map(v -> new Tuple(v.getKey(), v.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Вычисляет лучшего ученика по сумме баллов.
     *
     * @param stream
     * @return Ученик (имя, балл)
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects()
                        .stream()
                        .mapToDouble(subject -> subject.getScore()).sum()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }

    /**
     * Вычисляет предмет с бОльшим количеством баллов.
     *
     * @param stream
     * @return Предмет (название, балл)
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(e -> new Tuple(e.getKey(), e.getValue()))
                .max(Comparator.comparing(Tuple::getScore)).get();
    }
}