package com.digital.academy.service.impl;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.StudentFormDTO;
import com.digital.academy.entity.formDto.StudentUpdateFormDTO;
import com.digital.academy.infraData.utils.JavaTimeUtils;
import com.digital.academy.repository.StudentRepository;
import com.digital.academy.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student createStudent(StudentFormDTO studentForm) {
        Student student = new Student();
        student.setFirstName(studentForm.getFirstName());
        student.setLastName(studentForm.getLastName());
        student.setCpfNif(studentForm.getCpfNif());
        student.setResidenceAddress(studentForm.getResidenceAddress());
        student.setBirthDate(studentForm.getBirthDate());

        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id);
    }

      @Override
    public List<Student> getAllStudents(String birthDate) {

        if(birthDate == null) {
            return studentRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(birthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return studentRepository.findByBirthDate(localDate);
        }

    }

    @Override
    public Student updateStudent(Long id, StudentUpdateFormDTO UpdateForm) {
        return null;
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public List<PhysicalEvaluation> getEvaluationsById(Long id) {

        Student student = studentRepository.findById(id).get();

        return student.getEvaluations();
    }

}
