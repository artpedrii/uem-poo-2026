package com.tutu;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    
    //construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getSalario() {
        return salario;
    }

    //metodo
    public abstract void exibirDados();

}
