package com.tutu;

public class Usuario {
    private String nome;
    private TipoUsuario tipoUsuario;

    //construtor 
    public Usuario(TipoUsuario tipoUsuario, String nome) {
        this.tipoUsuario = tipoUsuario;
        this.nome = nome;
    }

    //getter
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public String getNome(){
        return nome;
    }
}
