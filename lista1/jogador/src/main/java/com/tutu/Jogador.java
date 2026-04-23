package com.tutu;

public class Jogador {
    //atributos
    private String nome;
    private int pontuacao = 0; //pontuação começa zerada
    private int nivel = 1; //nivel começa em 1 

    //getters
    public String getNome() {
        return nome;
    }
    public int getPontuacao() {
        return pontuacao;
    }
    public int getNivel() {
        return nivel;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //metodos
    public void adicionarPontos(int valor){
        pontuacao = pontuacao + valor;
    }
    public void subirNivel(){
        nivel = pontuacao / 100;
    }
}
