package com.digital.academy.controller;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.formDto.PhysicalEvaluationFormDTO;
import com.digital.academy.service.impl.PhysicalEvaluationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/avaliacoes")
public class PhysicalEvaluationController {

    @Autowired
    private PhysicalEvaluationServiceImpl evaluationService;

    @PostMapping
    public PhysicalEvaluation createEvaluation(@RequestBody PhysicalEvaluationFormDTO evaluationForm) {
       return evaluationService.createEvaluation(evaluationForm);
    }

}
