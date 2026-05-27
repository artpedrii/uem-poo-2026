package com.tutu;

public class Passaro extends Animal {

    //construtor
    public Passaro(String nome, String especie) {
        super(nome, especie);
    }
    //metodo
    @Override
    public void fazerSom(){
        System.out.println("Espécie: " + getEspecie());
        System.out.println("O pássaro faz pruu!!");
    }
    
}
