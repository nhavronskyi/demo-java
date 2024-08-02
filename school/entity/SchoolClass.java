package school.entity;

import java.util.List;

public class SchoolClass {
    private final int id;
    private final Teacher teacher;
    private final List<Student> students;
    private int grade;

    public SchoolClass(int id, Teacher teacher, List<Student> students, int grade) {
        this.id = id;
        this.teacher = teacher;
        this.students = students;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getGrade() {
        return grade;
    }

    public void upGrade() {
        grade++;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentById(int id) {
        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int studentId) {
        students.remove(studentId);
    }
}
