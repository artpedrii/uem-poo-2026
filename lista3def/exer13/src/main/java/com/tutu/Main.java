package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

        System.out.println("Escreva o nome do aluno: ");
        String nomeA = leitor.nextLine();
        System.out.println("Escreva a idade do aluno: ");
        int idadeA = leitor.nextInt(); leitor.nextLine(); 
        System.out.println("Escreva a matrícula do aluno: ");
        String matricula = leitor.nextLine();
        System.out.println("Escreva o curso do aluno: ");
        String curso = leitor.nextLine();

        Aluno aluno = new Aluno(matricula, curso, nomeA, idadeA);
        listaPessoas.add(aluno); 


        System.out.println("\nEscreva o nome do professor: ");
        String nomeP = leitor.nextLine();

        System.out.println("Escreva a idade do professor: ");
        int idadeP = leitor.nextInt(); 
        leitor.nextLine(); 

        System.out.println("Escreva a disciplina do professor: ");
        String disciplina = leitor.nextLine();

        System.out.println("Escreva o salário do professor: ");
        double salario = leitor.nextDouble(); 
        leitor.nextLine(); 

        Professor professor = new Professor(disciplina, salario, nomeP, idadeP);
        listaPessoas.add(professor);



        Pessoa[] arrayPessoas = new Pessoa[2]; 

        arrayPessoas[0] = aluno;
        arrayPessoas[1] = professor;

        
        for (Pessoa p : listaPessoas) {
            p.exibirDados(); 
        }
        
        for (int i = 0; i < arrayPessoas.length; i++) {
            arrayPessoas[i].exibirDados();
        }
    }
}
    
