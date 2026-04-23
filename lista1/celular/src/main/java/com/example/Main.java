package com.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Celular celular = new Celular();
        celular.setMarca("Samsung");
        celular.setModelo("Galaxy S21");
        celular.setNivelBateria(50);

        System.out.println("Digite 0 para carregar a bateria ou 1 para usar a bateria:\nPara encerrar o uso, digite 2.  ");
        int opcao = leitor.nextInt();
        while (opcao != 2){
            if (opcao == 0){
                System.out.println("Digite a quantidade que deseja carregar: ");
                int carga = leitor.nextInt();
                celular.carregarBateria(carga);
                System.out.println("Nível de bateria atual: " + celular.getNivelBateria());
            }
            else if (opcao == 1){
                System.out.println("Digite a quantidade que deseja usar: ");
                int consumo = leitor.nextInt();
                celular.usarBateria(consumo);
                System.out.println("Nível de bateria atual: " + celular.getNivelBateria());
            }
            else {
                System.out.println("Opção inválida. Digite 0 para carregar, 1 para usar ou 2 para encerrar.");
            }
            opcao = leitor.nextInt();
        }
    }
}