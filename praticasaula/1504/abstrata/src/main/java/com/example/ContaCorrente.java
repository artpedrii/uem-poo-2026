package com.example;

public class ContaCorrente extends ContaBancaria{
    private double limiteConta;

    public ContaCorrente(int id, int numeroConta, String titular, double limiteConta){
        super(id, numeroConta, titular);
        this.limiteConta = limiteConta;
    }

    @Override
    public void exibirTitular(){
        System.out.println("Conta corrente");
    }

    @Override
    public void sacar(double valor){
        if (limiteConta + getSaldo() >= valor){
            setSaldo(getSaldo()-valor);
            System.out.println("Saque com sucesso");
        }
        else {
            System.out.println("Saldo insuficiente"); 
        }
    }

    @Override
    public void depositar(double valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito com sucesso");
    }

    @Override
    public void exibirTipoConta(){

    }
}
