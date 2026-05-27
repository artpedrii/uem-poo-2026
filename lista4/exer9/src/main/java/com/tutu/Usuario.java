package com.tutu;

public class Usuario {
    private String nome;
    private TipoUsuario permissao;
    
    //construtor
    public Usuario(String nome, TipoUsuario permissao) {
        this.nome = nome;
        this.permissao = permissao;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public TipoUsuario getPermissao() {
        return permissao;
    }
}
