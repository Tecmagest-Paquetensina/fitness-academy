package com.digital.academy.service;

import com.digital.academy.entity.PhysicalEvaluation;
import com.digital.academy.entity.formDto.PhysicalEvaluationFormDTO;
import com.digital.academy.entity.formDto.PhysicalEvaluationUpdateFormDTO;

import java.util.List;

public interface IPhysicalEvaluationService {
  /**
   * Cria uma Avaliação Física e salva no banco de dados.
   * @param form - formulário referente aos dados para criação da Avaliação Física no banco de dados.
   * @return - Avaliação Física recém-criada.
   */
  PhysicalEvaluation create(PhysicalEvaluationFormDTO form);

  /**
   * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
   * @param id - id da Avaliação Física que será exibida.
   * @return - Avaliação Física de acordo com o Id fornecido.
   */
  PhysicalEvaluation get(Long id);

  /**
   * Retorna todas as Avaliações Física que estão no banco de dados.
   * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
   */
  List<PhysicalEvaluation> getAll();

  /**
   * Atualiza a avaliação física.
   * @param id - id da Avaliação Física que será atualizada.
   * @param formUpdate - formulário referente aos dados necessários para atualização da Avaliação
   * Física no banco de dados.
   * @return - Avaliação Física recém-atualizada.
   */
  PhysicalEvaluation update(Long id, PhysicalEvaluationUpdateFormDTO formUpdate);

  /**
   * Deleta uma Avaliação Física específica.
   * @param id - id da Avaliação Física que será removida.
   */
  void delete(Long id);
}
