package com.tutu;

public abstract class Pessoa {
    private String nome;
    private int idade;
    
    //construtor
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

    //metodo
    public abstract void exibirDados();
}
