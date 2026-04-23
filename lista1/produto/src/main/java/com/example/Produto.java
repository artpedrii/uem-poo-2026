package com.example; 

public class Produto{
    private String nome;
    private double preco; 

    //getters
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    //metodo 
    public void mostrarProduto(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco); 
    }
}
