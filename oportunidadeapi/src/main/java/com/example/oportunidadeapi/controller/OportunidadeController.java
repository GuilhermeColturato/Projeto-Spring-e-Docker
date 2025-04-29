package com.example.oportunidadeapi.controller;

import com.example.oportunidadeapi.model.Oportunidade;
import com.example.oportunidadeapi.service.OportunidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oportunidades")
@CrossOrigin(origins = "*")
public class OportunidadeController {

    @Autowired
    private OportunidadeService oportunidadeService;

    @GetMapping
    public List<Oportunidade> listarTodas() {
        return oportunidadeService.listarTodas();
    }

    @PostMapping
    public Oportunidade criar(@RequestBody Oportunidade oportunidade) {
        return oportunidadeService.salvar(oportunidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oportunidade> buscarPorId(@PathVariable String id) {
        return oportunidadeService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable String id) {
        oportunidadeService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }
}

