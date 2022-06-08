package com.digital.academy.controller;

import com.digital.academy.entity.Registration;
import com.digital.academy.entity.formDto.RegistrationFormDTO;
import com.digital.academy.service.impl.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl registrationService;

    @PostMapping
    public Registration createEnrollment(@Valid @RequestBody RegistrationFormDTO registrationForm) {
        return registrationService.createRegistration(registrationForm);
    }

    @GetMapping
    public List<Registration> getAllEnrollments(@RequestParam(value = "residence",
                                                required = false) String residenceAddress) {
        return registrationService.getAllRegistrations(residenceAddress);
    }
}
