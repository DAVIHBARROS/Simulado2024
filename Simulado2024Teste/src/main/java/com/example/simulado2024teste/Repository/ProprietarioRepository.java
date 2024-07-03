package com.example.simulado2024teste.Repository;

import com.example.simulado2024teste.Entity.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    }

