package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.test.entities.Skier;
import tn.esprit.test.services.SkierService;

@RestController
@RequestMapping("sckier")

public class SkierController {
    private SkierService skierService;

    @PostMapping("add")
    public Skier addSkier( @RequestBody Skier sckier){

        return skierService.addSkier(sckier);
    }
    @PostMapping("add-skier-course/{numCourse}")
    public Skier addSkierAndAssignToCourse(
            @RequestBody  Skier skier, @PathVariable(name = "numCourse") Long numCourse
    ){
        return skierService.addSkierAndAssignToCourse(skier, numCourse);
    }

}
























