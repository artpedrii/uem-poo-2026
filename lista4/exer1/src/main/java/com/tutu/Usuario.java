package com.tutu;

public class Usuario {
    private String nome;
    private TipoUsuario tipo;

    // Construtor
    public Usuario(String nome, TipoUsuario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    //getter
    public TipoUsuario getTipo() { 
        return tipo;
    }
    public String getNome() {
        return nome;
    }


}
