package school.entity;

import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final String surname;
    private final int grade;
    private final int age;
    private final String gender;
    private final List<Lesson> lessons;

    public Student(int id, String name, String surname, int grade, int age, String gender, List<Lesson> lessons) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.grade = grade;
        this.age = age;
        this.gender = gender;
        this.lessons = lessons;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }
}
