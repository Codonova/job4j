package labmda.task;

/**
 * Хранит в себе название и балл учебного предмета.
 * @author Ruslan Kooslapchenkov
 */
public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}