package com.digital.academy.repository;

import com.digital.academy.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    /**
     *
     * @param birthDate: data de nascimento dos alunos
     * @return lista os alunos com a data de nascimento passada como parâmetro da função
     */
    List<Student> findByBirthDate(LocalDate birthDate);
}
