package com.example;

public class Main {
    public static void main(String[] args) {
        Produto shampoo = new Produto(); 
        Produto condicionador = new Produto();
        shampoo.setNome("Shampoo");
        condicionador.setNome("Condicionador");
        condicionador.setPreco(14.99);
        shampoo.setPreco(19.90); 


        shampoo.mostrarProduto();
        condicionador.mostrarProduto();;
    }
}