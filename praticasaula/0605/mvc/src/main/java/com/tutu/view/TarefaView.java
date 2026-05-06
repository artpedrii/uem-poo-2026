package com.tutu.view;

import java.util.List;
import java.util.Scanner;

import com.tutu.controller.TarefaControle;
import com.tutu.model.Tarefa;

public class TarefaView {
    private Scanner scan;
    private TarefaControle controle; 

    public TarefaView(){
        this.scan = new Scanner(System.in); 
        this.controle = new TarefaControle(); 
    }

    public void exibirMenu(){
        int opcao;
        do {
            System.out.println("System Tarefas");
            System.out.println("Digite 0, 1 ou 2: ");
            opcao = Integer.parseInt(scan.nextLine()); 
            switch (opcao) {
                case 1:
                    cadastrarTarefa();
                    break;
            
                case 2:
                    listarTarefas();
                    break;

                case 0:
                    System.out.println("Encerrando ...");
                    break;

                default:
                    System.out.println("Opção incorreta."); 
                    break;    

            }
        } while (opcao != 0);
    }

    private void cadastrarTarefa(){
        System.out.println("Digite o título: ");
        String titulo = scan.nextLine();

        System.out.println("Digite a descrição: ");
        String descricao = scan.nextLine();

        controle.cadastrarTarefa(titulo, descricao);
    }

    private void listarTarefas(){
        List<Tarefa> lista = controle.listarTarefas();
        for (Tarefa t : lista){
            System.out.println(t.toString());
        }

    }
}
