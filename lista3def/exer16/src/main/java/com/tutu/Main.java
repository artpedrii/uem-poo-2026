package com.tutu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();

        Gerente gerente1 = new Gerente("João", 5000.0, "Gerente de Vendas", "Vendas", 1000.0, 5);
        Vendedor vendedor1 = new Vendedor("Maria", 3000.0, "Vendedor", "Vendas", 500.0);
        listaFuncionarios.add(gerente1);
        listaFuncionarios.add(vendedor1);

        for (Funcionario funcionario : listaFuncionarios) {
            funcionario.exibirDados();
        }
    }
}