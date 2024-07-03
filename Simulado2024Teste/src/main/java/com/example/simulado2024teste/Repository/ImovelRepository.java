package com.example.simulado2024teste.Repository;

import com.example.simulado2024teste.Entity.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

    public interface ImovelRepository extends JpaRepository<Imovel, Long> {
    }

