package com.tutu;

public class Gato extends Animal {

    //construtor
    public Gato(String nome, String especie) {
        super(nome, especie);
    }

    //metodo
    @Override
    public void fazerSom(){
        System.out.println("Espécie: " + getEspecie());
        System.out.println("O gato mia, Miau!");
    }
}
