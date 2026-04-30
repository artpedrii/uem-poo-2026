package com.example;

public abstract class ContaBancaria {
    private int id;
    private int numeroConta;
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(int id, int numeroConta, String titular){
        this.id = id;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    //getters
    public int getId(){
        return id;
    }
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
    public void setSaldo(double saldo){
        this.saldo = saldo; 
    }

    //metodos 
    public void exibirTitular(){
        System.out.println("Titular: " + titular);
    }
    public abstract void exibirTipoConta();

    public abstract void sacar(double valor);

    public abstract void depositar(double valor);
}
