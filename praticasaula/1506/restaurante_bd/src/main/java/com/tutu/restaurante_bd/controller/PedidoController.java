package com.tutu.restaurante_bd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutu.restaurante_bd.model.Pedido;
import com.tutu.restaurante_bd.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> lerPedidos(){
        return pedidoService.lerPedidos();
    }
}
