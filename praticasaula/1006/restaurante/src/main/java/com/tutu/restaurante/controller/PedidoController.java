package com.tutu.restaurante.controller;

import java.util.List;

import com.tutu.restaurante.model.Pedido;
import com.tutu.restaurante.service.PedidoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    
    @PostMapping
    public Pedido criarPedido(Pedido pedido){
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> lerPedidos(){
        return pedidoService.lerListaPedido();
    }
}
