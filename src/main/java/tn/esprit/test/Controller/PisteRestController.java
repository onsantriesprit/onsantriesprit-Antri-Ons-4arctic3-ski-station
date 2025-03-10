package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.test.entities.Piste;
import tn.esprit.test.services.PisteServiceImp;

@RestController
@RequestMapping("piste")
public class PisteRestController {

    private final PisteServiceImp pisteService;

    // Constructor injection for PisteServiceImp
    public PisteRestController(PisteServiceImp pisteService) {
        this.pisteService = pisteService;
    }

    @PostMapping("add")
    public Piste addPiste(@RequestBody Piste piste) {
        return pisteService.addPiste(piste);
    }
}
