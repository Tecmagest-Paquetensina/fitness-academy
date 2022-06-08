package com.digital.academy.controller;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.StudentFormDTO;
import com.digital.academy.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping
    public Student createStudent(@Valid @RequestBody StudentFormDTO studentForm) {
        return studentService.createStudent(studentForm);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<PhysicalEvaluation> getEvaluationsById(@PathVariable Long id) {
        return studentService.getEvaluationsById(id);
    }

    @GetMapping
    public List<Student> getAllEvaluations(@RequestParam(value = "birthDate", required = false)
                                           String birthDate){
        return studentService.getAllStudents(birthDate);
    }
}
