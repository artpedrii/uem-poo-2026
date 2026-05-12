package com.tutu;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Prof Carlos Weiss", 25, "Zona 7", "Maringá");
        Casa casa1 = new Casa("Azul", 1, endereco1);
        casa1.exibirCasa();
    }
}