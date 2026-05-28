package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        Scanner leitor = new Scanner(System.in);

        //cadastrar pessoas
        cadastrar(leitor, listaPessoas);
        //listar pessoas
        listarGeral(listaPessoas);
        //listar por tipo
        System.out.println("Escreva 1 se quiser listar apenas os professores, 2 se quiser listar apenas os alunos e 3 se quiser listar apenas os coordenadores.");
        int tipo = leitor.nextInt();
        listarPorTipo(listaPessoas, tipo);
        //buscar por nome
        System.out.println("Escreva o nome da pessoa que você quer buscar: ");
        leitor.nextLine();
        String nome = leitor.nextLine();
        buscarPorNome(listaPessoas, nome);
    }
    //metodo de cadastro
    public static void cadastrar(Scanner leitor, ArrayList<Pessoa> listaPessoas) {
        System.out.println("Escreva 1 se quiser cadastrar professor, 2 se quiser cadastrar aluno e 3 se quiser cadastrar coordenador.");
        int acao = leitor.nextInt();
        if (acao == 1) {
            System.out.println("Escreva o nome do professor: ");
            String nome = leitor.nextLine();
            System.out.println("Escreva a idade do professor: ");
            int idade = leitor.nextInt();
            leitor.nextLine();
            System.out.println("Escreva a disciplina que o professor ministra: ");
            String disciplina = leitor.nextLine();
            System.out.println("Escreva o salário do professor: ");
            double salario = leitor.nextDouble();
            Professor professor = new Professor(nome, idade, disciplina, salario);
            listaPessoas.add(professor);
        }
        else if (acao == 2) {
            System.out.println("Escreva o nome do aluno: ");
            String nome = leitor.nextLine();
            System.out.println("Escreva a idade do aluno: ");
            int idade = leitor.nextInt();
            leitor.nextLine();
            System.out.println("Escreva a matrícula do aluno: ");
            String matricula = leitor.nextLine();
            System.out.println("Escreva o curso do aluno: ");
            String curso = leitor.nextLine();
            Aluno aluno = new Aluno(nome, idade, matricula, curso);
            listaPessoas.add(aluno);
        }
        else if (acao == 3) {
            System.out.println("Escreva o nome do coordenador: ");
            String nome = leitor.nextLine();
            System.out.println("Escreva a idade do coordenador: ");
            int idade = leitor.nextInt();
            leitor.nextLine();
            System.out.println("Escreva o curso coordenado pelo coordenador: ");
            String curso = leitor.nextLine();
            System.out.println("Escreva o salário do coordenador: ");
            double salario = leitor.nextDouble();
            Coordenador coordenador = new Coordenador(nome, idade, curso, salario);
            listaPessoas.add(coordenador);
        }

    }
    //metodo de listagem geral
    public static void listarGeral(ArrayList<Pessoa> listaPessoas) {
        for (Pessoa pessoa : listaPessoas) {
            pessoa.exibirDados();
        }
    }
    //metodo de listagem por tipo
    public static void listarPorTipo(ArrayList<Pessoa> listaPessoas, int tipo) {
        for (Pessoa pessoa : listaPessoas) {
            if (tipo == 1 && pessoa instanceof Professor) {
                pessoa.exibirDados();
            }
            else if (tipo == 2 && pessoa instanceof Aluno) {
                pessoa.exibirDados();
            }
            else if (tipo == 3 && pessoa instanceof Coordenador) {
                pessoa.exibirDados();
            }
        }
    }
    
    //busca por nome
    public static void buscarPorNome(ArrayList<Pessoa> listaPessoas, String nome) {
            for (Pessoa pessoa : listaPessoas) {
                if (pessoa.getNome().equals(nome)) {
                    pessoa.exibirDados();
                }
            }
    }
}
