package com.tutu;

public class Paciente {
    private String nome;
    private int idade;
    private Prontuario prontuario;

    //construtores
    public Paciente(String nome, int idade, Prontuario prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public Prontuario getProntuario() {
        return prontuario;
    }
    
    //metodos
    public void exibirPaciente(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        prontuario.exibirDadosProntuario();
    }
}
