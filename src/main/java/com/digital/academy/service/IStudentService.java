package com.digital.academy.service;

import com.digital.academy.entity.formDto.StudentFormDTO;
import com.digital.academy.entity.Student;
import com.digital.academy.entity.formDto.StudentUpdateFormDTO;

import java.util.List;

public interface IStudentService {
  /**
   * Cria um Aluno e salva no banco de dados.
   * @param form - formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return - Aluno recém-criado.
   */
  Student create(StudentFormDTO form);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   * @param id - id do Aluno que será exibido.
   * @return - Aluno de acordo com o Id fornecido.
   */
  Student get(Long id);

  /**
   * Retorna todos os Alunos que estão no banco de dados.
   * @return - Uma lista os Alunos que estão salvas no DB.
   */
  List<Student> getAll();

  /**
   * Atualiza o Aluno.
   * @param id - id do Aluno que será atualizado.
   * @param formUpdate - formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return - Aluno recém-atualizado.
   */
  Student update(Long id, StudentUpdateFormDTO formUpdate);

  /**
   * Deleta um Aluno específico.
   * @param id - id do Aluno que será removido.
   */
  void delete(Long id);
}
