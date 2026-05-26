package com.tutu;

public class Professor {
    private String nome;
    private Turma turma;
    private String curso;

    //construtor
    public Professor(String nome, Turma turma, String curso) {
        this.nome = nome;
        this.turma = turma;
        this.curso = curso;
    }

    //getter
    public String getNome() {
        return nome;
    }
    public Turma getTurma() {
        return turma;
    }
    public String getCurso() {
        return curso;
    }
}
