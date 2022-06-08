package com.digital.academy.service.impl;

import com.digital.academy.entity.Registration;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.RegistrationFormDTO;
import com.digital.academy.repository.RegistrationRepository;
import com.digital.academy.repository.StudentRepository;
import com.digital.academy.service.IRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Registration createRegistration(RegistrationFormDTO registrationForm) {
        Registration registration = new Registration();
        Student student = studentRepository.findById(registrationForm.getStudentId()).get();

        registration.setStudent(student);

        return registrationRepository.save(registration);
    }

    @Override
    public Registration getRegistration(Long id) {
        return registrationRepository.findById(id).get();
    }

    @Override
    public List<Registration> getAllRegistrations(String residenceAddress) {

        if (residenceAddress == null) {
            return registrationRepository.findAll();
        } else {
            return registrationRepository.findStudentEnrollmentResidence(residenceAddress);
        }
    }

    @Override
    public void deleteRegistration(Long id) {

    }
}
