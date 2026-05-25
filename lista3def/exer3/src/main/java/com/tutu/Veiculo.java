package com.tutu;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    
    //construtores
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    //metodo
    public abstract void exibirDadosVeiculo();
}
