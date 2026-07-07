package com.shimano.guilherme.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.shimano.guilherme.exception.JogadaInvalidaException;
import com.shimano.guilherme.exception.PartidaEncerradaException;
import com.shimano.guilherme.exception.PartidaNaoEncontradaException;
import com.shimano.guilherme.model.Jogador;
import com.shimano.guilherme.model.Partida;
import com.shimano.guilherme.model.Simbolo;
import com.shimano.guilherme.model.StatusPartida;
import com.shimano.guilherme.repository.PartidaRepository;

@Service
public class PartidaService {

    private final PartidaRepository partidaRepository;

    public PartidaService(PartidaRepository partidaRepository) {
        this.partidaRepository = partidaRepository;
    }

    public Partida criar(String nomeJogadorX, String nomeJogadorO) {
        if (nomeJogadorX == null || nomeJogadorX.isBlank()
                || nomeJogadorO == null || nomeJogadorO.isBlank()) {
            throw new IllegalArgumentException("Os nomes dos jogadores são obrigatórios");
        }

        Jogador jogadorX = new Jogador(nomeJogadorX.trim(), Simbolo.X);
        Jogador jogadorO = new Jogador(nomeJogadorO.trim(), Simbolo.O);
        Partida partida = new Partida(jogadorX, jogadorO);

        return partidaRepository.save(partida);
    }

    public List<Partida> listar() {
        return partidaRepository.findAll();
    }

    public Partida consultar(Long id) {
        return buscarPartida(id);
    }

    public Partida jogar(Long id, Simbolo simbolo, int linha, int coluna) {
        Partida partida = buscarPartida(id);

        if (partida.getStatus() != StatusPartida.EM_ANDAMENTO) {
            throw new PartidaEncerradaException("Não é permitido jogar em uma partida encerrada");
        }

        if (simbolo != partida.getTurnoAtual()) {
            throw new JogadaInvalidaException("Não é a vez do jogador informado");
        }

        if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
            throw new IllegalArgumentException("A linha e a coluna devem estar entre 0 e 2");
        }

        if (!partida.posicaoLivre(linha, coluna)) {
            throw new JogadaInvalidaException("A posição informada já está ocupada");
        }

        partida.marcarPosicao(linha, coluna, simbolo);

        if (partida.verificarVitoria(simbolo)) {
            partida.registrarVitoria(simbolo);
        } else if (partida.tabuleiroCompleto()) {
            partida.registrarEmpate();
        } else {
            partida.alternarTurno();
        }

        return partidaRepository.save(partida);
    }

    public void excluir(Long id) {
        Partida partida = buscarPartida(id);
        partidaRepository.delete(partida);
    }

    private Partida buscarPartida(Long id) {
        Optional<Partida> partida = partidaRepository.findById(id);

        if (partida.isPresent()) {
            return partida.get();
        }

        throw new PartidaNaoEncontradaException("Partida não encontrada");
    }
}
