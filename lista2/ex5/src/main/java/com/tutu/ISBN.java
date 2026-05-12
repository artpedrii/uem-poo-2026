package com.tutu;

public class ISBN {
    private String codigo;
    private String editora;

    //construtor
    public ISBN(String codigo, String editora){
        this.codigo = codigo;
        this.editora = editora;
    }

    //getters
    public String getCodigo() {
        return codigo;
    }
    public String getEditora() {
        return editora;
    }
}
