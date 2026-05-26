package com.tutu;

import java.util.List;
import java.util.ArrayList;

public class Sys {
    private List<Nota> listaNotas;


    //construtor
    public Sys(List<Nota> listaNotas){
        this.listaNotas = new ArrayList<Nota>();
    }

    //registrarNota
    public void cadastrarNota(Professor prof, Turma turma, Nota nota) {
        if (prof.getCurso() == turma.getCurso()) {
           System.out.println("Nota registrada com sucesso."); 
           listaNotas.add(nota);
        }
        else {
            System.out.println("Não foi possível cadastrar a nota. Curso diferente do seu.");
        }
    }
}
