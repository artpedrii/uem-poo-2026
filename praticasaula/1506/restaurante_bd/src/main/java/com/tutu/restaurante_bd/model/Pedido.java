package com.tutu.restaurante_bd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pedido {

    @Id
    private int id;
    private String nome;
    
    //getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
}
