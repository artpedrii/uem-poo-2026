package com.tutu;

public class Pessoa {
    private String nome;
    private int idade;
    private CPF cpf;

    //construtor
    public Pessoa(String nome, int idade, CPF cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    //getters
       public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public CPF getCpf() {
        return cpf;
    }

    //metodos
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        cpf.exibirDadoscpf();
    }
}
