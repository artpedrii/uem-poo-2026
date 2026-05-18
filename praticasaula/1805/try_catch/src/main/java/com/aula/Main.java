package com.aula;

import com.aula.controller.AlunoController;
import com.aula.execao.Validacao;

public class Main {
    public static void main(String[] args) {
        AlunoController aluno1 = new AlunoController();
        AlunoController aluno2 = new AlunoController();


        try{
            aluno1.cadastrar("Robs", 5);
        }catch(Validacao e){
            System.out.println(e.getMessage());
        }

        try{
            aluno2.cadastrar("", 5);
        }catch(Validacao e){
            System.out.println(e.getMessage());
        }
    }
}
