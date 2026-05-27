package com.tutu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sys {
    private List<Atividade> listaAtividades;
    private Scanner leitor;
    
    //construtor
    public Sys(List<Atividade> listaAtividades, Scanner leitor) {
        this.listaAtividades = new ArrayList<Atividade>();
        this.leitor = new Scanner(System.in);
    }

    //getters
    public List<Atividade> getListaAtividades(){
        return listaAtividades;
    }
    public Scanner getLeitor(){
        return leitor;
    }

    //metodo
    public void registrarAtividade(Usuario user){
        System.out.println("Digite o título da atividade:");
        String titulo = leitor.nextLine();
        System.out.println("Digite a descrição da atividade:");
        String descricao = leitor.nextLine();
        Atividade atividade = new Atividade(user, titulo, descricao);
        listaAtividades.add(atividade);
        System.out.println("Atividade registrada com sucesso!");
    }

    public void removerAtividade(Usuario user, Atividade atividade){
        if (user.getNome() == atividade.getUserResponsavel().getNome()){
            listaAtividades.remove(atividade);
            System.out.println("Atividade removida com sucesso!");
        }
        else {
            System.out.println("Não foi possível remover a atividade pois o usuário não é o mesmo que a criou.");
        }
    }
    

}
