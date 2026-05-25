package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
        for (int i = 0; i <= 4; i++) {
            System.out.println("Escreva o nome do produto: ");
            String nome = leitor.nextLine();
            System.out.println("Escreva o preço do produto: ");
            double preco = leitor.nextDouble();
            leitor.nextLine();
            Produto produto = new Produto(nome, preco);

            listaProdutos.add(produto);
        }

        Produto elementoMaisCaro = listaProdutos.get(0);
        for (Produto elemento: listaProdutos) {
            elemento.exibirDados();
            if (elemento.getPreco() > elementoMaisCaro.getPreco()) {
                elementoMaisCaro = elemento;
            }
        }
        System.out.println("Produto de maior valor: " );
        elementoMaisCaro.exibirDados();
    }
}