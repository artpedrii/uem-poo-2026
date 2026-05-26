package com.tutu;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private StatusAluno statusAtual;
    
    //construtor
    public Aluno(String nome, String matricula, String curso, StatusAluno statusAtual) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.statusAtual = statusAtual;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    public StatusAluno getStatusAtual() {
        return statusAtual;
    }
}
