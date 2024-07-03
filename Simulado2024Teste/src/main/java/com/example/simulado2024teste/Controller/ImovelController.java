package com.example.simulado2024teste.Controller;

import com.example.simulado2024teste.Entity.Imovel;
import com.example.simulado2024teste.Service.ImovelService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("imovel")
public class ImovelController {
    @Autowired
    private ImovelService imovelService;

    @PostMapping("/cadastrar")
    public String cadastrarImovel(@RequestBody @Valid Imovel imovel) {
        imovelService.cadastrarImovel(imovel);
        return " cadastrato com sucesso";
    }

    @GetMapping("buscar")
    public List<Imovel> buscarImovel() {
        return imovelService.buscarImovel();
    }

    @PutMapping("atualizar")
    public Imovel atualizarImovel(@RequestBody Imovel imovel) {
        return imovelService.update(imovel);
    }

    @DeleteMapping("apagar/{id}")
    public String apagarImovel(@PathVariable Long id) {
        imovelService.delete(id);
        return "excluido com susseso";
    }
}
