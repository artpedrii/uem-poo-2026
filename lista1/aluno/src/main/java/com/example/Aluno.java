package com.example;

public class Aluno{
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;

    //getters
    public String getNome(){
        return nome;
    }
    public int getMatricula(){
        return matricula;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula; 
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    //metodos
    public double calcularMedia(){
        double media = (nota1 + nota2) / 2;
        return media; 
    }
    public String verificarAprovacao(){
        if (calcularMedia() >= 7.0){
            return "aprovado.";
        }
        else{
            return "reprovado."; 
        }
    }
}

