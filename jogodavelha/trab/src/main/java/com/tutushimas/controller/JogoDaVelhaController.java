package com.tutushimas.controller;

import com.tutushimas.model.Tabuleiro;
import com.tutushimas.model.Jogador;
import com.tutushimas.model.StatusPartida;

public class JogoDaVelhaController {
    private Tabuleiro tabuleiro;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private StatusPartida statusAtual;

    public JogoDaVelhaController(Jogador j1, Jogador j2){
        tabuleiro = new Tabuleiro();
        this.jogador1 = j1;
        this.jogador2 = j2;
        this.jogadorAtual = j1;
        this.statusAtual = StatusPartida.EM_ANDAMENTO;
    }

    //getters
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    public Jogador getJogador1() {
        return jogador1;
    }
    public Jogador getJogador2() {
        return jogador2;
    }
    public Jogador getJogadorAtual() {
        return jogadorAtual;
    }
    public StatusPartida getStatusAtual() {
        return statusAtual;
    }

    //setters
     public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }
    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }
    public void setJogadorAtual(Jogador jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }
    public void setStatusAtual(StatusPartida statusAtual) {
        this.statusAtual = statusAtual;
    }

    //metodos
    public void realizarJogada(int linha, int coluna) {
        if (statusAtual == StatusPartida.EM_ANDAMENTO) {
            if (tabuleiro.posicaoLivre(linha, coluna)){
                tabuleiro.registrarJogada(linha, coluna, jogadorAtual.getSimbolo());
                if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())){
                    statusAtual = StatusPartida.VITORIA;
                }
                else if (tabuleiro.verificarEmpate()){
                    statusAtual = StatusPartida.EMPATE;
                }
                else {
                    if (jogadorAtual == jogador1) {
                        jogadorAtual = jogador2;
                    }
                    else {
                        jogadorAtual = jogador1;
                    }
                }
            }
        }
    }
}
