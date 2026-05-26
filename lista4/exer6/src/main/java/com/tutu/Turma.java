package com.tutu;

public class Turma {
    String curso; 
    int NumeroTurma; 

    //construtor
    public Turma(String curso, int numeroTurma) {
        this.curso = curso;
        this.NumeroTurma = numeroTurma;
    }

    //getters
    public String getCurso() {
        return curso;
    }
    public int getNumeroTurma() {
        return NumeroTurma;
    }
}
