package school.service;

import school.entity.SchoolClass;

public interface SchoolClassService {

    SchoolClass getSchoolClass();

    double getClassAverageGrade();

    boolean checkIfAllStudentsAttendToTheSameClasses();
}
