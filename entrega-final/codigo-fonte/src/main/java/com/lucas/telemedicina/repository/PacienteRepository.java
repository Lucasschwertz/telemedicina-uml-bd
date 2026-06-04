package com.lucas.telemedicina.repository;

import com.lucas.telemedicina.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}