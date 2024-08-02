package school.entity;

import java.util.List;

public class SchoolClass {
    private final int id;
    private final Teacher teacher;
    private final List<Student> students;

    public SchoolClass(int id, Teacher teacher, List<Student> students) {
        this.id = id;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return null;
    }
}
