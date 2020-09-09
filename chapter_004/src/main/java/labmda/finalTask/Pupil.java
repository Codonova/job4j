package labmda.finalTask;

import java.util.List;

/**
 * Класс хранит в себе данные по ученикам и их баллам.
 * @author Ruslan Kooslapchenkov
 */
public class Pupil {
    private String name;
    private List<Subject> subjects;

    public Pupil(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}