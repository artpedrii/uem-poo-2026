package com.tutu;

public class Main {
    public static void main(String[] args) {
        Pessoa[] vetor_pessoa = new Pessoa[4];
        Aluno aluno1 = new Aluno("145100", "CC", "tutu", 19);
        Aluno aluno2 = new Aluno("145101", "FARMACIA", "jujubinha", 19);
        Professor prof1 = new Professor("Fundamentos de Algoritmos", 25000.0, "Uber", 47);
        Professor prof2 = new Professor("Estrutura de Dados", 25000.0, "Franklin", 47);
        vetor_pessoa[0] = aluno1;
        vetor_pessoa[1] = aluno2;
        vetor_pessoa[2] = prof1;
        vetor_pessoa[3] = prof2;

        for (int i = 0; i < vetor_pessoa.length; i++){
            vetor_pessoa[i].exibirDados();
        }
    }
}