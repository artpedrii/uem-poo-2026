package com.tutu;

public class Pedido {
    private StatusPedido statusAtual;
    private int numeroOrdem;
    private String descricao;
    
    //construtor
    public Pedido(StatusPedido statusAtual, int numeroOrdem, String descricao) {
        this.statusAtual = statusAtual;
        this.numeroOrdem = numeroOrdem;
        this.descricao = descricao;
    }

    //getters
    public StatusPedido getStatusAtual() {
        return statusAtual;
    }
    public int getNumeroOrdem() {
        return numeroOrdem;
    }
    public String getDescricao() {
        return descricao;
    } 

    //set
    public void setStatusAtual(StatusPedido statusAtual){
        this.statusAtual = statusAtual;
    }
}
