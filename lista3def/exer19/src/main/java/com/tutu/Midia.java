package com.tutu;

public abstract class Midia {
    private String titulo;
    private String ano; 

    //construtor
    public Midia(String titulo, String ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAno() {
        return ano;
    }

    //metodo
    public abstract void exibirDetalhes();
}
