package com.example;

public class Celular{
    private String marca;
    private String modelo;
    private int nivelBateria;

    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getNivelBateria() {
        return nivelBateria;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    //metodos
    public void carregarBateria(int carga){
        if (nivelBateria + carga > 100){
            nivelBateria = 100;
        }
        else {
            nivelBateria = nivelBateria + carga;
        }
    }
    public void usarBateria(int consumo){
        if (nivelBateria - consumo < 0){
            nivelBateria = 0;
        }
        else {
            nivelBateria = nivelBateria - consumo;
        }
    }
    
}