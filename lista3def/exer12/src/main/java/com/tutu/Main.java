package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Aluno> cadastradoAlunos = new ArrayList<Aluno>();
        System.out.println("Digite uma opção: \n1 para cadastrar aluno, 2 para listar alunos, 3 para remover aluno.\n para encerrar, digite 0: ");
        int opcao = leitor.nextInt();
        leitor.nextLine();
        while (opcao != 0){
            if (opcao == 1){
                System.out.println("Escreva o nome do aluno: ");
                String nome = leitor.nextLine();
                System.out.println("Escreva a idade do aluno: ");
                int idade = leitor.nextInt();
                leitor.nextLine();
                System.out.println("Escreva a matrícula do aluno: ");
                String matricula = leitor.nextLine();
                System.out.println("Escreva o curso do aluno: ");
                String curso = leitor.nextLine();

                Aluno aluno = new Aluno(matricula, curso, nome, idade);
                cadastradoAlunos.add(aluno);
            }
            else if (opcao == 2){
                for (Aluno alunoTemp: cadastradoAlunos) {
                    alunoTemp.exibirDados();
                }
            }
            else if (opcao == 3) {
                System.out.println("Escreva a matricula do aluno que deseja remover: ");
                String matricula = leitor.nextLine();
                for (Aluno alunoTemp: cadastradoAlunos) {
                    if (alunoTemp.getMatricula().equals(matricula)){
                        cadastradoAlunos.remove(alunoTemp);
                        break;
                    }
                }
            }
            else {
                System.out.println("Opção inválida: ");
            }
            opcao = leitor.nextInt();
            leitor.nextLine();
        }

    }
}