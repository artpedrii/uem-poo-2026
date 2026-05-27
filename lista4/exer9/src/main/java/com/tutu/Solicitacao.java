package com.tutu;

public class Solicitacao {
    private String titulo;
    private String descricao;
    private StatusSolicitacao statusAtual;

    //construtor
    public Solicitacao(String titulo, String descricao, StatusSolicitacao statusAtual) {
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
    public StatusSolicitacao statusAtual() {
        return statusAtual;
    }

    //set
    public void setStatusAtual(StatusSolicitacao statusAtual){
        this.statusAtual = statusAtual;
    }

}
