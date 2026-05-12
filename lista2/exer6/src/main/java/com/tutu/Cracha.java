package com.tutu;

public class Cracha {
    private String codigo;
    private String dataValidade;
    
    //construtor
    public Cracha(String codigo, String dataValidade) {
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }

    //getters
    public String getCodigo() {
        return codigo;
    }
    public String getDataValidade() {
        return dataValidade;
    }
}
