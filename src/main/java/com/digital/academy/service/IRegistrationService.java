package com.digital.academy.service;

import com.digital.academy.entity.Registration;
import com.digital.academy.entity.formDto.RegistrationFormDTO;

import java.util.List;

public interface IRegistrationService {
  /**
   * Cria uma Matrícula e salva no banco de dados.
   * @param registrationForm - formulário referente aos dados para criação da Matrícula no banco de dados.
   * @return - Matrícula recém-criada.
   */
  Registration createRegistration(RegistrationFormDTO registrationForm);

  /**
   * Retorna uma Matrícula que está no banco de dados de acordo com seu Id.
   * @param id - id da Matrícula que será exibida.
   * @return - Matrícula de acordo com o Id fornecido.
   */
  Registration getRegistration(Long id);

  /**
   * Retorna todas as Matrículas que estão no banco de dados.
   * @return - uma lista com todas as Matrículas que estão salvas no DB.
   */
  List<Registration> getAllRegistrations(String residenceAddress);

  /**
   * Exclui uma Matrícula específica.
   * @param id - id da Matrícula que será removida.
   */
  void deleteRegistration(Long id);

}
