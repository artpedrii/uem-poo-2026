package com.tutu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Carro[] vetor_carros = new Carro[4];

        for (int i = 0; i < vetor_carros.length; i++) {
            System.out.println("Escreva a marca do carro: ");
            String marca = leitor.nextLine();

            System.out.println("Escreva a quantidade de portas: ");
            int quantidade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Escreva o modelo do carro: ");
            String modelo = leitor.nextLine();

            Carro carro_temp = new Carro(marca, modelo, quantidade);

            vetor_carros[i] = carro_temp;
        }

        for (int i = 0; i < vetor_carros.length; i++) {
            vetor_carros[i].exibirDadosVeiculo();
        }
    }
}