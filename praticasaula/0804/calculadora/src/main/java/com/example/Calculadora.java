package com.example;

public class Calculadora {

    private double fator1, fator2;
    
    //getters
    public double getFator1(){
        return this.fator1;
    }
    public double getFator2(){
        return this.fator2;
    }

    //setters
    public void setFator1(double fator1){
        this.fator1 = fator1;
    }
    public void setFator2(double fator2){
        this.fator2 = fator2;
    }


    public Calculadora(){
    }

    public double somar(){
        return fator1 + fator2;
    }
    public double subtrair(){
        return fator1 - fator2;
    }
    public double multiplicacao(){
        return fator1 * fator2;
    }
    public double divisao(){
        if(fator2 == 0){
            throw new ArithmeticException("Divisao por zero.");
        }
        return fator1 / fator2;
    }
}
