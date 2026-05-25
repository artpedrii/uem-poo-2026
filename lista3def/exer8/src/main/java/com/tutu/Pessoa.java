package com.tutu;

public abstract class Pessoa {
    private String nome;
    private int idade;
    
    //construtores
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    //metodos
    public abstract void exibirDados(); 
}