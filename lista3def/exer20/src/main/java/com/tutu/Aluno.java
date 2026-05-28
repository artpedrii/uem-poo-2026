package com.tutu;

public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
    //construtor
    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    //getters
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }

    @Override
    public void exibirDados(){
        System.out.println("========================================================");
        System.out.println("Nome do aluno: " + getNome());
        System.out.println("Idade do aluno: " + getIdade());
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Curso do aluno: " + curso);
        System.out.println("========================================================");
    }
}
