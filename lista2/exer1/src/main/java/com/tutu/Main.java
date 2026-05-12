package com.tutu;

public class Main {
    public static void main(String[] args) {
        CPF cpf1 = new CPF("08898876623", "regular");
        Pessoa julia = new Pessoa("Julia", 19, cpf1); 
        julia.exibirDados();
    }
}