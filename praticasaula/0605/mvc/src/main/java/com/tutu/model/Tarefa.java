package com.tutu.model;

public class Tarefa {
    private String titulo;
    private String descricao;

    //construtores
    public Tarefa(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    //getters
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }
}
