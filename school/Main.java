package school;

import school.creator.CreatorHelper;
import school.entity.SchoolClass;
import school.service.SchoolClassService;
import school.service.SchoolService;
import school.service.impl.SchoolClassServiceImpl;

public class Main {
    public static void main(String[] args) {
        SchoolService service = CreatorHelper.createSchoolService(10, 27);

        SchoolClass schoolClass = service.getClassById(8);


        SchoolClassService schoolClassService = new SchoolClassServiceImpl(schoolClass);

        System.out.println("class: " + schoolClassService.getSchoolClass());
        System.out.println("Class average: " + schoolClassService.getClassAverageGrade());
        System.out.println("Check student attendance: " + schoolClassService.checkIfAllStudentsAttendToTheSameClasses());

    }


}
