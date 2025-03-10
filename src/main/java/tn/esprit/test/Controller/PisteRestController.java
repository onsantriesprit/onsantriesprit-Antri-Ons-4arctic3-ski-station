package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.*;
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


    @PatchMapping("assign-skier-to-piste")
    public Piste assignSkierToPiste(
            @RequestParam Long numSkier,
            @RequestParam Long numPiste
    ) {
        return pisteService.assignSkierToPiste(numSkier, numPiste);
    }
}
