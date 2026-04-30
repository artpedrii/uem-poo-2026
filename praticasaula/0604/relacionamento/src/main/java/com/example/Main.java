package com.example;

public class Main {
    public static void main(String[] args){
    Pessoa Julia = new Pessoa();

    Cidade cidadeMunir = new Cidade("Maringá", "123"); 
    Endereco enderecoMUnir = new Endereco("Maringaland", 0, "0000000000");
    Pessoa Munir = new Pessoa("MUNIR BERG SHEHADEH", "0000000001", 298, enderecoMUnir);

    System.out.println("Endereço ="+ Munir.getendereco().getRua()); 
    }
}

