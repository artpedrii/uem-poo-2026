package com.tutu.restaurante_bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.tutu.restaurante_bd.repository.PedidoRepository;

public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
}
