package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
























