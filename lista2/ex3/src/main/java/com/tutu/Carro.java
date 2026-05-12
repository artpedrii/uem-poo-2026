package com.tutu;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    //construtor
    public Carro(String marca, String modelo, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    //getters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public Motor getMotor() {
        return motor;
    }

    //metodos
    public void ligarCarro(){
        System.out.println("Vrummm! Carro ligado.");
    }
    public void exibirFichaTecnica(){
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro:  " + modelo);
        motor.exibirInformacoesMotor();
    }
}
