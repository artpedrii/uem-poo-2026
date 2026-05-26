package com.tutu;

public class Sys {
    //metodo
    public void entregarTarefa(Tarefa tarefaTemp){
        if (tarefaTemp.getStatusAtual() == StatusTarefa.EM_ANDAMENTO){
            System.out.println("Tarefa concluída com sucesso.");
            tarefaTemp.setStatusAtual(StatusTarefa.CONCLUIDA);
        }
        else {
            System.out.println("Tarefa não pode ser entregue. Status atual: " + tarefaTemp.getStatusAtual());
        }
    }
}
