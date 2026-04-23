package com.tutu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //criacao jogador
        Jogador tutu = new Jogador();
        tutu.setNome("Arthur");

        //simulação de ganho de pontos/exibição de nível e pontuação
        System.out.println("Digite 1 para jogar e aumentar pontuação: \nPara verificar pontuação e nível, digite 2: \nPara encerrar, digite 0.");
        int acao = leitor.nextInt();
        while (acao != 0){
            if (acao == 1){
                System.out.println("Digite quantos pontos você aumentou: ");
                int pontuacao_aumentada = leitor.nextInt();
                tutu.adicionarPontos(pontuacao_aumentada);
                tutu.subirNivel();
                System.out.println("Pontuação aumentada com sucesso. Digite sua próxima ação desejada: ");
            }
            else if (acao == 2){
                System.out.println("Sua pontuação é: " + tutu.getPontuacao());
                System.out.println("Seu nível é: " + tutu.getNivel());
                System.out.println("Digite sua próxima ação desejada: ");
            }
            acao = leitor.nextInt();
        }
    }
}