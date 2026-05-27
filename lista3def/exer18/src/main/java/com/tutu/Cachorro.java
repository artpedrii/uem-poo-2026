package com.tutu;

public class Cachorro extends Animal {

    //construtor
    public Cachorro(String nome, String especie) {
        super(nome, especie);
    }

    //metodo
    @Override
    public void fazerSom(){
        System.out.println("Espécie: " + getEspecie());
        System.out.println("O cachorro late, Au Au!");
    }
}
