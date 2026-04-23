package com.example;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(15.0);
        retangulo.setLargura(34.5);
        System.out.println("Sua área é: " + retangulo.calculaArea());
        System.out.println("Seu perímetro é :" + retangulo.calculaPerimetro()) ;
    }
}