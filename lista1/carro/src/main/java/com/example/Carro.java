package com.example;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade;

    //getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getVelocidade(){
        return velocidade; 
    }

    //setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade; 
    }

    //metodos
    public void acelerar(){
        velocidade = velocidade + 10;
    }
    public void frear(){
        velocidade = velocidade - 10;
        if (velocidade < 0){
            velocidade = 0;
        }
    }
    public void exibirVelocidade(){
        System.out.println("A velocidade é: " + velocidade); 
    }

}
