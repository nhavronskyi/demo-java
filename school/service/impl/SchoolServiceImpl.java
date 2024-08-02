package school.service.impl;

import school.entity.SchoolClass;
import school.entity.Student;
import school.service.SchoolService;

import java.util.List;

public class SchoolServiceImpl implements SchoolService {

    private final List<SchoolClass> schoolClasses;

    public SchoolServiceImpl(List<SchoolClass> schoolClasses) {
        this.schoolClasses = schoolClasses;
    }

    @Override
    public List<SchoolClass> getAllClasses() {
        return schoolClasses;
    }

    @Override
    public SchoolClass getClassById(int id) {
        return null;
    }

    @Override
    public void deleteClass(int id) {

    }

    @Override
    public void saveClass(SchoolClass schoolClass) {

    }

    @Override
    public List<Student> getAllStudents() {
        return List.of();
    }

    @Override
    public List<Student> getThreeBestStudents(int id) {
        return List.of();
    }
}
