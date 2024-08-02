package school.service.impl;

import school.entity.SchoolClass;
import school.service.SchoolClassService;

public class SchoolClassServiceImpl implements SchoolClassService {

    private final SchoolClass schoolClass;

    public SchoolClassServiceImpl(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public SchoolClass getSchoolClass() {
        return null;
    }

    @Override
    public double getClassAverageGrade() {
        return 0;
    }

    @Override
    public boolean checkIfAllStudentsAttendToTheSameClasses() {
        return false;
    }
}
