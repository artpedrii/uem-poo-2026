package com.example;

public class Main {
    public static void main(String[] args) {
        //criação do paciente
        Paciente paciente1 = new Paciente();
        paciente1.setNome("Munir");
        paciente1.setIdade(19);
        paciente1.setPeso(400.0);
        paciente1.setAltura(1.49);

        //exibicao IMC calculado
        System.out.println("IMC = " + paciente1.calcularIMC());
        
        //classificacao IMC
        paciente1.classificarIMC(paciente1.calcularIMC());
    }
}