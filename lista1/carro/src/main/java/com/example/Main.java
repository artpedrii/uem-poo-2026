package com.example;

import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        Carro carro = new Carro();

        System.out.println("Digite a marca do carro: ");
        String marcaDigitada = leitor.nextLine();
        carro.setMarca(marcaDigitada);

        System.out.println("Digite o modelo do carro: ");
        String modeloDigitado = leitor.nextLine();
        carro.setModelo(modeloDigitado);

        carro.setVelocidade(0);

        System.out.println("Digite 1 para acelerar, 2 para frear e 3 para verificar velocidade: \nPara encerrar, digite 0.");
        int acao = leitor.nextInt();

        while (acao != 0){
            if (acao == 1){
                carro.acelerar();
            }
            else if (acao == 2) {
                carro.frear();
            }
            else if (acao == 3){
                carro.exibirVelocidade();
            }
            else {
                System.out.println("Opção inválida.");
            }
            acao = leitor.nextInt();
        }


    }
}