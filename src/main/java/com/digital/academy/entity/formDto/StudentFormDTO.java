package com.digital.academy.entity.formDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentFormDTO {

  @NotEmpty(message = "Campo requerido, preencha de modo correcto.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String firstName;

  @NotEmpty(message = "Campo requerido, preencha de modo correcto.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String lastName;

  @NotEmpty(message = "Campo requerido, preencha de modo correcto.")
  private String cpfNif;

  @NotEmpty(message = "Campo requerido, preencha de modo correcto.")
  @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String residenceAddress;

  @NotNull(message = "Campo requerido, preencha de modo correcto.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate birthDate;
}
