package com.tutu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Aluno[] vetor_alunos = new Aluno[3];

        for (int i = 0; i < vetor_alunos.length; i++) {
            System.out.println("Escreva o nome do aluno: ");
            String nome = leitor.nextLine();

            System.out.println("Escreva a idade do aluno: ");
            int idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Escreva a maricula do aluno: ");
            String matricula = leitor.nextLine();

            System.out.println("Escreva o curso do aluno: ");
            String curso = leitor.nextLine();

            Aluno aluno_temp = new Aluno(matricula, curso, nome, idade);

            vetor_alunos[i] = aluno_temp;
        }

        for (int i = 0; i < vetor_alunos.length; i++) {
            vetor_alunos[i].exibirDados();
        }
    }
}