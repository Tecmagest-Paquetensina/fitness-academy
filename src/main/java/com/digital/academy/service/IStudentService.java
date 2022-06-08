package com.digital.academy.service;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.formDto.StudentFormDTO;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.StudentUpdateFormDTO;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
  /**
   * Cria um Aluno e salva no banco de dados.
   * @param studentForm - formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return - Aluno recém-criado.
   */
  Student createStudent(StudentFormDTO studentForm);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   *
   * @param id - id do Aluno que será exibido.
   * @return - Aluno de acordo com o Id fornecido.
   */
  Optional<Student> getStudent(Long id);

  /**
   * Retorna todos os Alunos que estão no banco de dados.
   * @return - Uma lista os Alunos que estão salvas no DB.
   */
  List<Student> getAllStudents(String birthDate);

  /**
   * Atualiza o Aluno.
   * @param id - id do Aluno que será atualizado.
   * @param updateForm - formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return - Aluno recém-atualizado.
   */
  Student updateStudent(Long id, StudentUpdateFormDTO updateForm);

  /**
   * Exclui um Aluno específico.
   * @param id - id do Aluno que será removido.
   */
  void deleteStudent(Long id);

  /**
   *
   * @param id id do aluno que será enviado para recuperar a lista das avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<PhysicalEvaluation> getEvaluationsById(Long id);

}
