package com.digital.academy.repository;

import com.digital.academy.entity.PhysicalEvaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysicalEvaluationRepository extends JpaRepository<PhysicalEvaluation, Long> {
}
