package com.example;

public class Main {
    public static void main(String[] args) {
        Aluno Julia = new Aluno(); 
        Julia.setNome("Julia");
        Julia.setMatricula(145100);
        Julia.setNota1(8.0);
        Julia.setNota2(9.5);
        System.out.println("A média do aluno é: " + Julia.calcularMedia()); 
        System.out.println("O aluno está " + Julia.verificarAprovacao()); 

    }
}