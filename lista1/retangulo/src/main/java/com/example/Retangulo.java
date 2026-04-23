package com.example;

public class Retangulo {
    private double altura;
    private double largura;

    //getters
    public double getAltura(){
        return altura;
    }
    public double getLargura(){
        return largura;
    }
    //setters
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    //metodos
    public double calculaArea(){
        double area = altura * largura;
        return area;
    }
    public double calculaPerimetro(){
        double perimetro = (altura * 2) + (largura * 2);
        return perimetro;
    }
}
