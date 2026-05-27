package com.tutu;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Animal[] listaAnimaisStatic = new Animal[3];
        Animal cachorro1 = new Cachorro("Rex", "Cachorro");
        Animal passaro1 = new Passaro("Piu-Piu", "Pássaro");
        Animal gato1 = new Gato("Miau", "Gato");
        listaAnimaisStatic[0] = cachorro1;
        listaAnimaisStatic[1] = passaro1;
        listaAnimaisStatic[2] = gato1;
        ArrayList<Animal> listaAnimaisDinamica = new ArrayList<Animal>();
        listaAnimaisDinamica.add(cachorro1);
        listaAnimaisDinamica.add(passaro1);
        listaAnimaisDinamica.add(gato1);

        System.out.println("Lista Estática:");
        for (Animal animal : listaAnimaisStatic) {
            animal.fazerSom();
            System.out.println();
        }
        System.out.println("Lista Dinâmica:");
        for (Animal animal : listaAnimaisDinamica) {
            animal.fazerSom();
            System.out.println();
        }
    }
}