package com.example.simulado2024teste.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.naming.factory.SendMailFactory;

import java.time.LocalDate;
import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Min(value = 3, message = "O nome não pode ser menor que 3")
    private String nome;
    private String cpf;

    @Email(message = "Email informado não é valido")
    private String email;
    private String telefone;
    private String endereco;

    @Past
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "proprietario")
    private List<Imovel> imoveis;


}
