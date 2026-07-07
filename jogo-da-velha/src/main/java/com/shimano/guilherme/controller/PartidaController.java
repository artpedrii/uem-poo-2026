package com.shimano.guilherme.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shimano.guilherme.model.Partida;
import com.shimano.guilherme.model.Simbolo;
import com.shimano.guilherme.service.PartidaService;

@RestController
@RequestMapping("/partidas")
public class PartidaController {

    private final PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public ResponseEntity<Partida> criar(
            @RequestParam String nomeJogadorX,
            @RequestParam String nomeJogadorO) {
        Partida partida = partidaService.criar(nomeJogadorX, nomeJogadorO);
        return ResponseEntity.status(HttpStatus.CREATED).body(partida);
    }

    @GetMapping
    public List<Partida> listar() {
        return partidaService.listar();
    }

    @GetMapping("/{id}")
    public Partida consultar(@PathVariable Long id) {
        return partidaService.consultar(id);
    }

    @PostMapping("/{id}/jogadas")
    public Partida jogar(
            @PathVariable Long id,
            @RequestParam Simbolo simbolo,
            @RequestParam int linha,
            @RequestParam int coluna) {
        return partidaService.jogar(id, simbolo, linha, coluna);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        partidaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
