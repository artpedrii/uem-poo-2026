package com.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(67, 6767, "TUTU", 10000000000.0);
        conta.depositar(67.0);
        conta.sacar(13.0);
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }
}
