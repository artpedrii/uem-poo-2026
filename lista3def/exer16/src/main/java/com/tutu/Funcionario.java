package com.tutu;

public abstract class Funcionario {
    private String nome;
    private double salario;
    
    //construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    //metodo
    public abstract void exibirDados();
}
