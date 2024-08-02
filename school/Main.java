package school;

import school.creator.CreatorHelper;
import school.service.SchoolService;

public class Main {
    public static void main(String[] args) {
        SchoolService service = CreatorHelper.createSchoolService(10, 27);

        System.out.println(service.getAllClasses());
    }


}
