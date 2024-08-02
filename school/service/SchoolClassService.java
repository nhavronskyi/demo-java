package school.service;

import school.entity.SchoolClass;

public interface SchoolClassService {

    SchoolClass getSchoolClass();

    void addStudentToClass();

    void deleteStudentFromClass();

    double getClassAverageGrade();

    boolean checkIfAllStudentsAttendToTheSameClasses();
}
