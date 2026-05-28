package com.tutu;

public class Professor extends Pessoa{
    private String disciplina;
    private double salario;
    
    //construtor
    public Professor(String nome, int idade, String disciplina, double salario) {
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
    
    //metodo
    @Override
    public void exibirDados(){
        System.out.println("========================================================");
        System.out.println("Nome do professor:  " + getNome());
        System.out.println("Idade do professor: " + getIdade());
        System.out.println("Disciplina ministrada pelo professor: " + disciplina);
        System.out.println("Salário do professor: " + salario);
        System.out.println("========================================================");
    }
}
