package com.tutu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(StatusPedido.PENDENTE, 1, "Pedido 1"));
        pedidos.add(new Pedido(StatusPedido.CONCLUIDO, 2, "Pedido 2"));
        pedidos.add(new Pedido(StatusPedido.PENDENTE, 3, "Pedido 3"));  
        Sys sys = new Sys(pedidos);
        sys.cancelaPedido(pedidos.get(0)); 
        sys.cancelaPedido(pedidos.get(1)); 
        sys.cancelaPedido(pedidos.get(2)); 
    }
}