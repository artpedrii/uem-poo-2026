package com.tutu;

public class Tarefa {
    private String titulo;
    private String descricao; 
    private StatusTarefa statusAtual;
    
    //construtor
    public Tarefa(String titulo, String descricao, StatusTarefa statusAtual) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.statusAtual = statusAtual;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public StatusTarefa getStatusAtual() {
        return statusAtual;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setStatusAtual(StatusTarefa statusAtual) {
        this.statusAtual = statusAtual;
    }
}
