package com.example;

public class Endereco {

    private String Rua;
    private int Número;
    private String CEP; 
    private Cidade cidade;

    public Endereco(String Rua, int Número, String CEP){
        this.Rua = Rua;
        this.Número = Número;
        this.CEP = CEP;
        this.cidade = cidade;
    }

    public String getRua(){
        return Rua;
    }

    public int getNúmero(){
        return Número;
    }

    public String getCEP(){
        return CEP;
    }
}

