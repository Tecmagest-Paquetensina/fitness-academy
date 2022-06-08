package com.digital.academy.entity.formDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationFormDTO {

  @NotNull(message = "Campo requerido, preencha de modo correcto.")
  @Positive(message = "O Id do aluno deve ser positivo.")
  private Long studentId;

}
