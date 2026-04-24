package com.tutu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //cadastro de três livros
        LivroBiblioteca livro1 = new LivroBiblioteca();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setCodigo("676767-67");
        LivroBiblioteca livro2 = new LivroBiblioteca();
        livro2.setTitulo("Apocalipse");
        livro2.setAutor("São João");
        livro2.setCodigo("686767-67");
        LivroBiblioteca livro3 = new LivroBiblioteca();
        livro3.setTitulo("Suma Teológica");
        livro3.setAutor("São Tomás de Aquino");
        livro3.setCodigo("696767-67");

        //simulação de empréstimos e devoluções/exibição do estado final de cada livro.
        System.out.println("Digite 1 para exibir livros da biblioteca.\nDigite 2 para emprestar um livro.\nDigite 3 para devolver um livro.\nDigite 4 para exibir a disponibilidade de um livro.\n Para encerrar a atividade na biblioteca, digite 0.");
        int acao = leitor.nextInt();
        while (acao != 0){
            if (acao == 1){
                livro1.exibirInformacoes();
                livro2.exibirInformacoes();
                livro3.exibirInformacoes();
            }
            else if (acao == 2){
                System.out.println("Insira o código do livro que quer emprestar: ");
                String emprestimo = leitor.next(); 
                if (emprestimo.equals(livro1.getCodigo())){
                    livro1.emprestar();
                }
                else if (emprestimo.equals(livro2.getCodigo())){
                    livro2.emprestar();
                }
                else if (emprestimo.equals(livro3.getCodigo())) {
                    livro3.emprestar();
                }
                else {
                    System.out.println("Insira um código de livro válido.");
                }
            }
            else if (acao == 3){
                System.out.println("Insira o código do livro que quer devolver: ");
                String devolucao = leitor.next(); 
                if (devolucao.equals(livro1.getCodigo())){
                    livro1.devolver();
                }
                else if (devolucao.equals(livro2.getCodigo())){
                    livro2.devolver();
                }
                else if (devolucao.equals(livro3.getCodigo())) {
                    livro3.devolver();
                }
                else {
                    System.out.println("Insira um código de livro válido.");
                }
            } 
            else if (acao == 4){
                System.out.println("Insira o código do livro que quer verificar disponibilidade: ");
                String disponibilidade = leitor.next();
                if (disponibilidade.equals(livro1.getCodigo())){
                     if (livro1.getDisponivel() == true){
                        System.out.println("Situação: Dispoível para empréstimo."); 
                    }
                    else {
                        System.out.println("Situação: Indisponível para empréstimo no momento.");
                    }
                }
                else if (disponibilidade.equals(livro2.getCodigo())){
                     if (livro2.getDisponivel() == true){
                        System.out.println("Situação: Dispoível para empréstimo."); 
                    }
                    else {
                        System.out.println("Situação: Indisponível para empréstimo no momento.");
                    }
                }
                else if (disponibilidade.equals(livro3.getCodigo())) {
                     if (livro3.getDisponivel() == true){
                        System.out.println("Situação: Dispoível para empréstimo."); 
                    }
                    else {
                        System.out.println("Situação: Indisponível para empréstimo no momento.");
                    }
                }
                else {
                    System.out.println("Insira um código de livro válido.");
                }
            }
            else {
                System.out.println("Insira uma ação válida.");
            }
            System.out.println("Digite a próxima ação desejada: ");
            acao = leitor.nextInt();
        }
    }
}