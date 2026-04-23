package com.example;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    //getters
    public String getnome(){
        return nome;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSalario(){
        return salario;
    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    //metodos
    public void aumentarSalario(double percentual){
        salario = ((percentual / 100) * salario) + salario;
    }
    public void exibirFuncionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario); 
    }
}
