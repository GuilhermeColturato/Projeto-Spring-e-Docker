package com.example.oportunidadeapi.service;

import com.example.oportunidadeapi.model.Oportunidade;
import com.example.oportunidadeapi.repository.OportunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OportunidadeService {

    @Autowired
    private OportunidadeRepository oportunidadeRepository;

    public List<Oportunidade> listarTodas() {
        return oportunidadeRepository.findAll();
    }

    public Oportunidade salvar(Oportunidade oportunidade) {
        return oportunidadeRepository.save(oportunidade);
    }

    public Optional<Oportunidade> buscarPorId(String id) {
        return oportunidadeRepository.findById(id);
    }

    public void deletarPorId(String id) {
        oportunidadeRepository.deleteById(id);
    }
}

