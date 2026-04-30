package com.example;

public class Aluno extends Pessoa {
    private String curso;

    public void Aluno(String nome, int idade, String curso){
        Super(Pessoa); 
        this.curso = curso;
    }
    public String getCurso(){
        return curso; 
    }
    @Override
    public void envelhecer(){
        idade = idade + 2; 
    }
}