package com.tutu;

public class Carro extends Veiculo {
    private int quantidadePortas;

    //construtor
    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    //getters
    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    //metodo
    public void exibirDadosVeiculo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Quantidade portas: " + quantidadePortas);
    }
    
}
