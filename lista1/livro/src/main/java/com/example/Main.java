package com.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro livro = new Livro();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setQuantidadePaginas(300);
        livro.setEmprestado(false);

        livro.emprestarLivro();
        livro.emprestarLivro();
        livro.devolverLivro();
        livro.verificarDisponilidade();


    }
}