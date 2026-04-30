package com.tutu;

public enum NivelAcesso {
    ADMIN("Admnistrador"),
    USUARIO("Usuário"),
    LEITOR("Visitante");

    private String descricao;

    NivelAcesso (String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
