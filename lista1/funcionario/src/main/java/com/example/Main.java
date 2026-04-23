package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Arthur");
        funcionario.setCargo("Diretor");
        funcionario.setSalario(23000.0);

        System.out.println("Funcionário antes do aumento: ");
        funcionario.exibirFuncionario();

        funcionario.aumentarSalario(25.0);
        System.out.println("Funcionário após o aumento: ");
        funcionario.exibirFuncionario();
    }
}