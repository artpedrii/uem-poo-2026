package com.tutushimas.model;

public class Tabuleiro {
    private Simbolo[][] posicoes;

    //construtor
    public Tabuleiro() {
        posicoes = new Simbolo[3][3];
    }

    //metodo
    public void exibirTabuleiro(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(posicoes[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean posicaoLivre(int linha, int coluna){
        return posicoes[linha][coluna] == null;
    }

    public void registrarJogada(int linha, int coluna, Simbolo simbolo){
        posicoes[linha][coluna] = simbolo;
    }

    public boolean verificarVitoria(Simbolo simbolo){
        boolean vitoria = false;
        for (int i = 0; i < 3; i++){
            if (posicoes[i][0] == simbolo && posicoes[i][1] == simbolo && posicoes[i][2] == simbolo){
                vitoria = true;
            }
            if (posicoes[0][i] == simbolo && posicoes[1][i] == simbolo && posicoes[2][i] == simbolo){
                vitoria = true;
            }
        }
        if (posicoes[0][0] == simbolo && posicoes[1][1] == simbolo && posicoes[2][2] == simbolo) {
            vitoria = true;
        }
        if (posicoes[0][2] == simbolo && posicoes[1][1] == simbolo && posicoes[2][0] == simbolo) {
            vitoria = true;
        }
        return vitoria;
    }

    public boolean verificarEmpate(){
        for (int i = 0; i < 3;  i++){
            for (int j = 0; j < 3; j++){
                if (posicoes[i][j] == null){
                    return false;
                }
            }
        }
        return true;
    }
}
