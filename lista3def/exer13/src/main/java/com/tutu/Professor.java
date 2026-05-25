package com.tutu;

public class Professor extends Pessoa {

    private String disciplina;
    private double salario;

    //construtor
    public Professor(String disciplina, double salario, String nome, int idade){
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    //getters
    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    //metodos
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário " + salario);
    }
}
