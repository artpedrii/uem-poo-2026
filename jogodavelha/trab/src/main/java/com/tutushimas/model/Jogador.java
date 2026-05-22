package com.tutushimas.model;

public class Jogador {
    private String nome;
    private Simbolo simbolo;
    
    //construtor
    public Jogador(String nome, Simbolo simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public Simbolo getSimbolo() {
        return simbolo;
    }
}
