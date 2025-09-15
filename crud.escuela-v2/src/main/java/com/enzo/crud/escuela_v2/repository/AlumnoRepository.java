package com.enzo.crud.escuela_v2.repository;

import com.enzo.crud.escuela_v2.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    // metodos customs aqui
}
