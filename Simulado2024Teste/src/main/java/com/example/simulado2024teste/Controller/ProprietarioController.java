package com.example.simulado2024teste.Controller;

import com.example.simulado2024teste.Entity.Imovel;
import com.example.simulado2024teste.Entity.Proprietario;
import com.example.simulado2024teste.Service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("proprietario")
public class ProprietarioController {
    @Autowired
    private ProprietarioService proprietarioService;

    @PostMapping("/cadastrar")
    public String cadastrarProprietario(@RequestBody @Valid Proprietario proprietario) {
        proprietarioService.cadastrarProprietario(proprietario);
        return "Proprietario cadastrato com sucesso";
    }

    @GetMapping("buscar")
    public List<Proprietario> buscarProprietario() {
        return proprietarioService.buscarProprietario();
    }

    @PutMapping("atualizar")
    public Proprietario atualizarProprietario(@RequestBody Proprietario proprietario) {
        return proprietarioService.update(proprietario);
    }

    @DeleteMapping("apagar/{id}")
    public String apagarImovel(@PathVariable Long id) {
        proprietarioService.delete(id);
        return "excluido com susseso";
    }
}