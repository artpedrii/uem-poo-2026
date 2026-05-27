package com.tutu;

public class Atividade {
    private Usuario userResponsavel;
    private String titulo;
    private String descricao;

    //construtor
    public Atividade(Usuario userResponsavel, String titulo, String descricao){
        this.userResponsavel = userResponsavel;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    //getters
    public Usuario getUserResponsavel(){
        return userResponsavel;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }
}
