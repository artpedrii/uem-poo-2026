package com.shimano.guilherme.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Jogador jogadorX;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Jogador jogadorO;

    private String tabuleiro;

    @Enumerated(EnumType.STRING)
    private Simbolo turnoAtual;

    @Enumerated(EnumType.STRING)
    private StatusPartida status;

    @OneToOne
    private Jogador vencedor;

    public Partida() {
    }

    public Partida(Jogador jogadorX, Jogador jogadorO) {
        this.jogadorX = jogadorX;
        this.jogadorO = jogadorO;
        this.tabuleiro = "---------";
        this.turnoAtual = Simbolo.X;
        this.status = StatusPartida.EM_ANDAMENTO;
        this.vencedor = null;
    }

    public Long getId() {
        return id;
    }

    public Jogador getJogadorX() {
        return jogadorX;
    }

    public Jogador getJogadorO() {
        return jogadorO;
    }

    public String[][] getTabuleiro() {
        String[][] matriz = new String[3][3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                char valor = tabuleiro.charAt(linha * 3 + coluna);

                if (valor == '-') {
                    matriz[linha][coluna] = null;
                } else {
                    matriz[linha][coluna] = String.valueOf(valor);
                }
            }
        }

        return matriz;
    }

    public Simbolo getTurnoAtual() {
        return turnoAtual;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public Jogador getVencedor() {
        return vencedor;
    }

    public Simbolo consultarPosicao(int linha, int coluna) {
        int posicao = linha * 3 + coluna;
        char valor = tabuleiro.charAt(posicao);

        if (valor == '-') {
            return null;
        }

        return Simbolo.valueOf(String.valueOf(valor));
    }

    public boolean posicaoLivre(int linha, int coluna) {
        return consultarPosicao(linha, coluna) == null;
    }

    public void marcarPosicao(int linha, int coluna, Simbolo simbolo) {
        int posicao = linha * 3 + coluna;
        StringBuilder novoTabuleiro = new StringBuilder(tabuleiro);
        novoTabuleiro.setCharAt(posicao, simbolo.toString().charAt(0));
        tabuleiro = novoTabuleiro.toString();
    }

    public boolean verificarVitoria(Simbolo simbolo) {
        char s = simbolo.toString().charAt(0);

        return (tabuleiro.charAt(0) == s && tabuleiro.charAt(1) == s && tabuleiro.charAt(2) == s)
                || (tabuleiro.charAt(3) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(5) == s)
                || (tabuleiro.charAt(6) == s && tabuleiro.charAt(7) == s && tabuleiro.charAt(8) == s)
                || (tabuleiro.charAt(0) == s && tabuleiro.charAt(3) == s && tabuleiro.charAt(6) == s)
                || (tabuleiro.charAt(1) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(7) == s)
                || (tabuleiro.charAt(2) == s && tabuleiro.charAt(5) == s && tabuleiro.charAt(8) == s)
                || (tabuleiro.charAt(0) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(8) == s)
                || (tabuleiro.charAt(2) == s && tabuleiro.charAt(4) == s && tabuleiro.charAt(6) == s);
    }

    public boolean tabuleiroCompleto() {
        return !tabuleiro.contains("-");
    }

    public void alternarTurno() {
        if (turnoAtual == Simbolo.X) {
            turnoAtual = Simbolo.O;
        } else {
            turnoAtual = Simbolo.X;
        }
    }

    public void registrarVitoria(Simbolo simbolo) {
        status = StatusPartida.VITORIA;

        if (simbolo == Simbolo.X) {
            vencedor = jogadorX;
        } else {
            vencedor = jogadorO;
        }
    }

    public void registrarEmpate() {
        status = StatusPartida.EMPATE;
    }
}
