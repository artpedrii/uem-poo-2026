package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<FiguraGeometrica> estrFiguras = new ArrayList<>();

        FiguraGeometrica quadrado = new Quadrado(4);
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());

        FiguraGeometrica triangulo = new Triangulo(2, 2);
        System.out.println("A área do triângulo é: " + triangulo.calcularArea());

        estrFiguras.add(triangulo);
        estrFiguras.add(quadrado);
        estrFiguras.add(new Quadrado(2.5));

        for (FiguraGeometrica xetelba : estrFiguras){
            System.out.println("Figura: " + xetelba.getNome());
            System.out.println("Área: " + xetelba.calcularArea()); 
            System.out.println("================================"); 
        }
    }
}   