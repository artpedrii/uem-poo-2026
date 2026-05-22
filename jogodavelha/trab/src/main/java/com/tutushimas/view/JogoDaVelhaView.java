package com.tutushimas.view;

import com.tutushimas.controller.JogoDaVelhaController;
import com.tutushimas.model.Jogador;
import com.tutushimas.model.Simbolo;
import com.tutushimas.model.StatusPartida;
import com.tutushimas.model.Tabuleiro;

import java.util.Scanner;

public class JogoDaVelhaView {
    private JogoDaVelhaController controle;
    private Scanner leitor;

    public JogoDaVelhaView(){
        leitor = new Scanner(System.in);
    }

    public void iniciar(){
        System.out.println("Bem vindos ao jogo da velha");
        System.out.println("Digite o nome do jogador 1 (X)");
        String nome1 = leitor.nextLine();
        System.out.println("Escreva o nome do jogador 2(O)");
        String nome2 = leitor.nextLine();

        Jogador jogador1 = new Jogador(nome1, Simbolo.X);
        Jogador jogador2 = new Jogador(nome2, Simbolo.O);

        controle = new JogoDaVelhaController(jogador1, jogador2);
        
        jogar(); // Chama o loop do jogo após inicializar tudo
    } 

    public void jogar() {
        while (controle.getStatusAtual() == StatusPartida.EM_ANDAMENTO) {
            
            System.out.println("\nVez do jogador: " + controle.getJogadorAtual().getNome());
            
            try {
                System.out.print("Digite a linha (0, 1 ou 2): ");
                int linha = leitor.nextInt();
                
                System.out.print("Digite a coluna (0, 1 ou 2): ");
                int coluna = leitor.nextInt();
                
                controle.realizarJogada(linha, coluna);
                
            } catch (Exception e) {
                System.out.println("Opa, algo deu errado: " + e.getMessage());
            }
        }
        
        System.out.println("\n--- FIM DE JOGO ---");
        if (controle.getStatusAtual() == StatusPartida.VITORIA) {
            System.out.println(" Parabéns! O vencedor é: " + controle.getJogadorAtual().getNome());
        } else {
            System.out.println("Deu velha! O jogo empatou.");
        }
    }
}