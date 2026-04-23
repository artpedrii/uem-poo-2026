package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner leitor = new Scanner(System.in); 

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = leitor.nextLine();
        conta.setTitular(nomeTitular);

       System.out.println("Digite o número da conta: ");
       int numero = leitor.nextInt();
       conta.setNumeroConta(numero);

       conta.setSaldo(0.0); 

        System.out.println("Digite 1 para Depósito, 2 para saque é 3 para consultar seu saldo. Para encerrar, digite 0: ");
        int operacao = leitor.nextInt();
    while (operacao != 0){

        if (operacao == 1){
                System.out.println("Digite o valor que deseja depositar: ");
                double valorDepositado = leitor.nextDouble();
                conta.depositar(valorDepositado);
        }
        else if (operacao == 2){
                System.out.println("Digite o valor que deseja sacar: ");
                double valorSaque = leitor.nextDouble();
                conta.sacar(valorSaque);
            }
        else if (operacao == 3){
                conta.consultarSaldo(); 
        }
        else{
                System.out.println("Opção inválida.");
        }
            System.out.println("Digite 1 para Depósito, 2 para saque é 3 para consultar seu saldo. Para encerrar, digite 0: ");
            operacao = leitor.nextInt();

      }


    }

}
