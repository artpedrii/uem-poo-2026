package com.example;

public class Pessoa {
    private String nome;
    protected int idade;

    public void Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public void envelhecer(){
        idade++;
    }
}


