package com.tutu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next();
        System.out.println("Digite a idade do aluno: ");
        int idade = leitor.nextInt();
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = leitor.next();
        System.out.println("Digite o curso do aluno: ");
        String curso = leitor.next();
        Aluno aluno1 = new Aluno(matricula, curso, nome, idade);
        
        aluno1.exibirDados();
    }
}