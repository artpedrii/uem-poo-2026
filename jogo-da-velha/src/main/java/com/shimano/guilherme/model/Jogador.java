package com.shimano.guilherme.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Simbolo simbolo;

    public Jogador() {
    }

    public Jogador(String nome, Simbolo simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }
}
