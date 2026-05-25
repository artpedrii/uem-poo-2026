package com.tutu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[5];

        //leitura dos numeros
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Escreva um número inteiro: ");
            int num = leitor.nextInt();
            vetor[i] = num;
        }

        //exibicao do vetor
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
        }
    }
}