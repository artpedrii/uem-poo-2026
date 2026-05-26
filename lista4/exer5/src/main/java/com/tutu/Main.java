package com.tutu;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar os conceitos de POO em Java", StatusTarefa.EM_ANDAMENTO);
        Tarefa tarefa2 = new Tarefa("Fazer exercícios", "Resolver os exercícios de POO", StatusTarefa.CONCLUIDA);
        Sys sistema = new Sys();
        sistema.entregarTarefa(tarefa1);
        sistema.entregarTarefa(tarefa2);
    }
}