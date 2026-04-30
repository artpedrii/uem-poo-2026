package com.example;

public abstract class FiguraGeometrica {
    private String nome;
    private int quantidadeLados;

    //construtor
    public FiguraGeometrica(String nome, int quantidadeLados){
        this.nome = nome;
        this.quantidadeLados = quantidadeLados;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getQuantidadeLados() {
        return quantidadeLados;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidadeLados(int quantidadeLados) {
        this.quantidadeLados = quantidadeLados;
    }

    //metodos 
    public abstract double calcularArea();

}
