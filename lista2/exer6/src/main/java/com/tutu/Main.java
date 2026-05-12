package com.tutu;

public class Main {
    public static void main(String[] args) {
        Cracha cracha1 = new Cracha("67676767-67", "18/01");
        Cracha cracha2 = new Cracha("67676767-69", "14/01");
        Funcionario func1 = new Funcionario("Julia", "CEO", cracha1);
        Funcionario func2 = new Funcionario("Arthur", "Segundo CEO", cracha2);
        func1.exibirFuncionario();
        func2.exibirFuncionario();

    }
}