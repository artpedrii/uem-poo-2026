package com.tutu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LivroDidatico> listaLivros = new ArrayList<LivroDidatico>();
        LivroDidatico[] listaLivrosStatic = new LivroDidatico[3];

        LivroDidatico livro1 = new LivroDidatico("Matemática Básica", "João Silva", "Matemática");
        LivroDidatico livro2 = new LivroDidatico("História do Brasil", "Maria Oliveira", "História");
        LivroDidatico livro3 = new LivroDidatico("Química Avançada", "Carlos Souza", "Química");    

        listaLivrosStatic[0] = livro1;
        listaLivrosStatic[1] = livro2;
        listaLivrosStatic[2] = livro3;

        listaLivros.add(livro1);
        listaLivros.add(livro2);

        System.out.println("Exibição do arraylist:");
        for (LivroDidatico livro_temp : listaLivros){
            livro_temp.exibirDados();
        }

        System.out.println("Exibição do array normal:");
        for (int i = 0; i < listaLivrosStatic.length; i++){
            listaLivrosStatic[i].exibirDados();
        }
    }
}