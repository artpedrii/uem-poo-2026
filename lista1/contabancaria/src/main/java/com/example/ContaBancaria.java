package com.example;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    //getters
    public int getNumeroConta(){
        return numeroConta;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    //setters
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo; 
    }
    //metodos
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void sacar(double valor){
        if ((saldo - valor) < 0){
            System.out.println("Saldo insuficiente.");
        }
        else {
            saldo = saldo - valor;
        }
    }
    public void consultarSaldo(){
        System.out.println("O seu saldo é: " + saldo);
    }
}
