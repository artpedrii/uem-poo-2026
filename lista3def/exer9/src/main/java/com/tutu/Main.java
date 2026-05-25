package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> listaNomes = new ArrayList<String>();
        for (int i = 0; i <= 4; i++){
            System.out.println("Escreva um nome: ");
            String nome = leitor.nextLine();
            listaNomes.add(nome);
        }

        for (String nome: listaNomes) {
            System.out.println(nome);
        }
        System.out.println("Quantidade elementos: "+ listaNomes.size());
    }
}