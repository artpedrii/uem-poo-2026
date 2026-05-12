package com.tutu;

public class Casa {
    private String cor;
    private int quantidadeQuartos;
    private Endereco endereco;
    

    //construtores
    public Casa(String cor, int quantidadeQuartos, Endereco endereco) {
        this.cor = cor;
        this.quantidadeQuartos = quantidadeQuartos;
        this.endereco = endereco;
    }

    //getters
    public String getCor() {
        return cor;
    }
    public int getQuantidadeQuartos() {
        return quantidadeQuartos;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    //metodo
    public void exibirCasa(){
        System.out.println("Cor: " + cor);
        System.out.println("Quantidade de quartos: " + quantidadeQuartos);
        endereco.exibirEndereco();
    }
    
}
