package com.example;

public class Quadrado extends FiguraGeometrica {
    private double lado; 

    //construtor
    public Quadrado(double lado){
        super("Quadrado", 4);
        this.lado = lado; 
    }

    //get
    public double getLado() {
        return lado;
    }

    //set
    public void setLado(double lado) {
        this.lado = lado;
    }

    //metodo abstrato implementado
    @Override
    public double calcularArea() {
        return (lado * lado);
    }    

}
