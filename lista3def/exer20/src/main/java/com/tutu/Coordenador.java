package com.tutu;

public class Coordenador extends Pessoa{
    private String curso;
    private double salario;
    
    //construtor
    public Coordenador(String nome, int idade, String curso, double salario) {
        super(nome, idade);
        this.curso = curso;
        this.salario = salario;
    }

    //getters
    public String getCurso() {
        return curso;
    }
    public double getSalario() {
        return salario;
    }

    //metodo
    @Override
    public void exibirDados(){
        System.out.println("========================================================");
        System.out.println("Nome do coordenador:  " + getNome());
        System.out.println("Idade do coordenador: " + getIdade());
        System.out.println("Curso coordenado: " + curso);
        System.out.println("Salário do coordenador: " + salario);
        System.out.println("========================================================");
    }
}
