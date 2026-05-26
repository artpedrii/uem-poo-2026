package com.tutu;

public class Usuario {
    private String nome;
    private TipoUsuario tipo;

    //construtor
    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public TipoUsuario getTipo() {
        return tipo;
    }

}
