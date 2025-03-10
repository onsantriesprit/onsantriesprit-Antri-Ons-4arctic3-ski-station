package tn.esprit.test.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RegistrationController {


    private final IRegistrationService registrationService;

    @PostMapping("add-registration/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(
            @RequestBody Registration registration,
            @PathVariable(name = "numSkier") Long numSkier
    ) {
        return registrationService.addRegistrationAndAssignToSkier(registration, numSkier);
    }
}

}
