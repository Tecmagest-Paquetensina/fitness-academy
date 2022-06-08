package com.digital.academy.service.impl;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.PhysicalEvaluationFormDTO;
import com.digital.academy.entity.formDto.PhysicalEvaluationUpdateFormDTO;
import com.digital.academy.repository.PhysicalEvaluationRepository;
import com.digital.academy.repository.StudentRepository;
import com.digital.academy.service.IPhysicalEvaluationService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhysicalEvaluationServiceImpl implements IPhysicalEvaluationService {

    @Autowired
    private PhysicalEvaluationRepository evaluationRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public PhysicalEvaluation createEvaluation(@NotNull PhysicalEvaluationFormDTO evaluationForm) {
        PhysicalEvaluation physicalEvaluation = new PhysicalEvaluation();
        Student student = studentRepository.findById(evaluationForm.getStudentId()).get();

        physicalEvaluation.setStudent(student);
        physicalEvaluation.setWeight(evaluationForm.getWeight());
        physicalEvaluation.setHeight(evaluationForm.getHeight());

        return evaluationRepository.save(physicalEvaluation);
    }

    @Override
    public PhysicalEvaluation getEvaluation(Long id) {
        return evaluationRepository.getById(id);
    }

    @Override
    public List<PhysicalEvaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }

     @Override
    public PhysicalEvaluation updateEvaluation(Long id, PhysicalEvaluationUpdateFormDTO formUpdate) {
        return null;
    }

    @Override
    public void deleteEvaluation(Long id) {
    }
}
