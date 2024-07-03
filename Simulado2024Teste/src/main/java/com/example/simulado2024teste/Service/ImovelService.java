package com.example.simulado2024teste.Service;

import com.example.simulado2024teste.Entity.Imovel;
import com.example.simulado2024teste.Repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {
    @Autowired
    ImovelRepository imovelRepository;

    public Imovel cadastrarImovel(Imovel imovel) {
        imovelRepository.save(imovel);
        return imovel;
    }

    public List<Imovel> buscarImovel() {
        return imovelRepository.findAll();
    }

    public Imovel update(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void delete(Long id) {
       imovelRepository.deleteById(id);
    }
}