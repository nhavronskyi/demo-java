package school.service;

import school.entity.SchoolClass;
import school.entity.Student;

import java.util.List;

public interface SchoolService {
    List<SchoolClass> getAllClasses();

    SchoolClass getClassById(int id);

    void deleteClass(int id);

    void saveClass(SchoolClass schoolClass);

    List<Student> getAllStudents();

    List<Student> getThreeBestStudents(int id);
}
