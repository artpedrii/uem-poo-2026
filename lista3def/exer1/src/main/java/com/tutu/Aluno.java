package com.tutu;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso; 
    
    public Aluno(String matricula, String curso, String nome, int idade){
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

    //metodo
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);  
    }
}
