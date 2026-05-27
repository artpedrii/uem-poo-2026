package com.tutu;

import java.util.List;

public class Sys {
    private List<Pedido> listaPedidos;

    //construtor
    public Sys(List<Pedido> listaPedidos){
        this.listaPedidos = listaPedidos;
    }

    //getters
    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    //metodos
    public void cancelaPedido(Pedido pedido){
        for (Pedido pedido_temp : listaPedidos){
            if (pedido_temp.getNumeroOrdem() == pedido.getNumeroOrdem()){
                if (pedido.getStatusAtual() == StatusPedido.PENDENTE){
                    pedido.setStatusAtual(StatusPedido.CANCELADO);
                    System.out.println("Pedido cancelado com sucesso!");
                }
                else {
                    System.out.println("Não foi possível cancelar, o pedido não está mais pendente.");
                }
            }
        }
    }
}
