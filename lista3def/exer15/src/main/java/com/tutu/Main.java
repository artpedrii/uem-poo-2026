package com.tutu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Funcionario[] listaFuncionariosStatic = new Funcionario[3];
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        Gerente gerente1 = new Gerente("João", 45, 8000.00, "TI", 2000.00, 5);
        Estagiario estagiario1 = new Estagiario("Maria", 22, 1500.00, "Sistemas de Informação", "Universidade XYZ", "2023001", "2");      
        Gerente gerente2 = new Gerente("Ana", 38, 7500.00, "Marketing", 1500.00, 3);  
        listaFuncionariosStatic[0] = gerente1;
        listaFuncionariosStatic[1] = estagiario1;
        listaFuncionariosStatic[2] = gerente2;
        listaFuncionarios.add(gerente1);
        listaFuncionarios.add(estagiario1);

        System.out.println("Exibindo dados dos funcionários (array estático):");
        for (int i = 0; i < listaFuncionariosStatic.length; i++) {
            listaFuncionariosStatic[i].exibirDados();
        }

        System.out.println("Exibindo dados dos funcionários (ArrayList):");
        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.exibirDados();
        }
    }
}