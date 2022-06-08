package com.digital.academy.repository;

import com.digital.academy.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    /**
     *
     * @param residenceAddress Endereço de residência referência para o filtro
     * @return lista de alunos matriculados que residem no Endereço de residência passado como parâmetro
     */
    @Query(value = "SELECT * FROM tb_registrations r " +
            "INNER JOIN tb_students s ON r.students_id = s.id " +
            "WHERE s.residenceAddress = :residenceAddress", nativeQuery = true)
    //@Query("FROM Registration r WHERE r.students.residenceAddress = :residenceAddress ")
    List<Registration> findStudentEnrollmentResidence(String residenceAddress);
}
