package com.tutu;

public abstract class Animal {
    private String nome;
    private String especie;
    
    //construtor
    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    //getter
    public String getNome() {
        return nome;
    }
    public String getEspecie(){
        return especie;
    }

    //metodo abstrato
    public abstract void fazerSom();

}
