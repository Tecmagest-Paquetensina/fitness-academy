package com.digital.academy.entity.formDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhysicalEvaluationFormDTO {

  private Long studentId;

  private double weight;

  private double height;
}
