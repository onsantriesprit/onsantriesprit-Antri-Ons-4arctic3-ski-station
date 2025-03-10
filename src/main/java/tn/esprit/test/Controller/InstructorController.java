package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class InstructorController {
    private final IInstructorService instructorService;

    @PostMapping("add-instructor/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(
            @RequestBody Instructor instructor,
            @PathVariable(name = "numCourse") Long numCourse) {
        return instructorService.addInstructorAndAssignToCourse(instructor, numCourse);
    }
}
}
