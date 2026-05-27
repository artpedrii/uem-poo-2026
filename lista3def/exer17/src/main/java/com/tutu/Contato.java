package com.tutu;

public abstract class Contato {
    private String nome;
    private String tipo;
    private String telefone;
    private String descricao;
    
    //construtor
    public Contato(String nome, String tipo, String telefone, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.telefone = telefone;
        this.descricao = descricao;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getDescricao() {
        return descricao;
    }

    //metodo
    public abstract void exibirDados();
}
