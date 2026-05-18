package com.aula.controller;

import java.util.ArrayList;
import java.util.List;

import com.aula.execao.Validacao;
import com.aula.model.Aluno;

public class AlunoController {
    //Aluno tem que ter nome não vazio
    //Aluno tem que ter nota não vazia, >=0 e <=10    

    private List<Aluno> listaAluno;

    public AlunoController(){
        this.listaAluno = new ArrayList<>();
    }

    public void cadastrar(String nome, double nota) throws Validacao{
        validarNome(nome);
        
        Aluno aluno = new Aluno(nome, nota);
        listaAluno.add(aluno);
    }

    private void validarNome(String nome) throws Validacao{
        if(nome == null || nome.isBlank()){
            throw new Validacao("O nome do aluno é obrigatório");
        }
    }
}
