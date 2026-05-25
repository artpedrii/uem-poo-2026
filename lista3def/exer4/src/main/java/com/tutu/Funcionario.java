package com.tutu;

public abstract class Funcionario {
    private String nome;
    private int salario;
    
    //construtor
    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getSalario() {
        return salario;
    }

    //metodo
    public abstract void exibirDados();
}
