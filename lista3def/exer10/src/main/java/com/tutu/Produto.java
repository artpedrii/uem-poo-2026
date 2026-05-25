package com.tutu;

public class Produto {
    private String nome;
    private double preco;
    
    //construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    //metodos
    public void exibirDados(){
        System.out.println("===================================");
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("===================================");
    }

}
