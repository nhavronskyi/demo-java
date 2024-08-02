package school.entity;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private final String name;
    private final List<Integer> grades = new ArrayList<>();

    public Lesson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
}
