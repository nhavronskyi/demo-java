package school.creator;

import school.entity.Lesson;
import school.entity.SchoolClass;
import school.entity.Student;
import school.entity.Teacher;
import school.service.SchoolService;
import school.service.impl.SchoolServiceImpl;

import java.util.List;
import java.util.stream.IntStream;

public class CreatorHelper {

    public static SchoolService createSchoolService(int classAmount, int amountStudentsInClass) {
        var classes = IntStream.rangeClosed(1, classAmount)
                .boxed()
                .map(i -> createSchoolClass(i, i, amountStudentsInClass))
                .toList();
        return new SchoolServiceImpl(classes);
    }

    public static SchoolClass createSchoolClass(int classId, int classGrade, int studentsAmount) {
        return new SchoolClass(classId, createTeacher(classId), createStudents(classId, studentsAmount, classGrade), classGrade);
    }

    private static Teacher createTeacher(int classId) {
        int teacherId = classId * 10 + 1;
        return new Teacher(teacherId, "name" + teacherId, "surname" + teacherId);
    }

    public static List<Student> createStudents(int classId, int studentsAmount, int classGrade) {
        int studentId = classId * 10 * 10;
        return IntStream.rangeClosed(1, studentsAmount)
                .boxed()
                .map(i -> studentId + i)
                .map(id -> new Student(id, "name" + id, "surname" + id, classGrade, classGrade + 6, genderHelper(id), generateLessons(classGrade + 2)))
                .toList();
    }

    private static List<Lesson> generateLessons(int amount) {
        return IntStream.rangeClosed(1, amount).boxed()
                .map(i -> "lesson" + i)
                .map(Lesson::new)
                .toList();
    }

    private static String genderHelper(int classId) {
        return classId % 2 == 0 ? "male" : "female";
    }
}
