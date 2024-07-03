package com.example.simulado2024teste.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Min(value = 10, message = "O endereço não pode ser menor que 10")
    private String endereco;

    @Min(value = 1, message = "O tamanho não pode ser menor que 1")
    private Double tamanho;
    private int numeroQuartos;

    @Min(value = 0, message = "A quantidade de banheiros não pode ser menor que 0")
    private int numeroBanheiros;
    private Double valor;
    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;
}
