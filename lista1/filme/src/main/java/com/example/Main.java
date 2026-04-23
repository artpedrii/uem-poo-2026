package com.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Filme filme = new Filme();
        filme.setTitulo("Interestellar");
        filme.setGenero("Ficção Científica");
        filme.setDuracao("2h 49m");
        filme.setAvaliacao(10);
        filme.exibirFichaTecnica();
        System.out.println("Digite a nova avaliação do filme: ");
        int novaAvaliacao = leitor.nextInt();
        filme.alterarAvalicao(novaAvaliacao);
        filme.exibirFichaTecnica();
    }
}