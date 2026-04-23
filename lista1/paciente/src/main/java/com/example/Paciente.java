package com.example;

public class Paciente {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura = altura; 
    }

    //metodos
    public double calcularIMC(){
         double IMC = peso / (altura * altura);
         return IMC;
    }

    public void classificarIMC(double IMC){
        if (IMC < 18.5){
            System.out.println("Classificacão = Baixo peso.");
        }
        else if ((IMC >= 18.5) && (IMC <= 24.9)){
            System.out.println("Classificação = Peso normal.");
        }
        else if ((IMC >= 25.0) && (IMC <= 29.9)){
            System.out.println("Classificação = Sobrepeso.");
        }
        else if ((IMC >= 30.0) && (IMC <= 34.9)){
            System.out.println("Classificação = Obesidade Grau I.");
        }
        else if ((IMC >= 35.0) && (IMC <= 39.9)){
            System.out.println("Classificação = Obesidade Grau II.");
        }
        else {
            System.out.println("Classificação = Obesidade Grau III/Obesidade Mórbida.");
        }
    }


    
}
