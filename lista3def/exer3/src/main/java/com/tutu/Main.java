package com.tutu;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda", "Civic", 4);
        Moto moto1 = new Moto("Honda", "CB300F", 300);
        carro1.exibirDadosVeiculo();
        moto1.exibirDadosVeiculo();
    }
}