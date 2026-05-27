package com.tutu;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Sys {
    private Scanner leitor;
    private List<Solicitacao> listaSolcitacoes;
    
    //construtor
    public Sys(Scanner leitor, List<Solicitacao> listaSolcitacoes) {
        this.leitor = new Scanner(System.in);
        this.listaSolcitacoes = new ArrayList<Solicitacao>();
    }

    //getters
    public Scanner getLeitor() {
        return leitor;
    }
    public List<Solicitacao> getListaSolcitacoes() {
        return listaSolcitacoes;
    }

    //metodo
    public void registraSolicitacao(){
        System.out.println("Escreva o título da solicitação: ");
        String t = leitor.nextLine();
        System.out.println("Escreva a descrição da solicitação: ");
        String d = leitor.nextLine();
        Solicitacao solicitacao = new Solicitacao(t, d, StatusSolicitacao.PENDENTE);
        listaSolcitacoes.add(solicitacao);
        System.out.println("Solicitação criada com sucesso!");
    }

    public void aprovarSolicitacao(Usuario user, Solicitacao s){
        if (user.getPermissao() == TipoUsuario.GERENTE){
            s.setStatusAtual(StatusSolicitacao.APROVADO);
            System.out.println("Solicitação aprovada com sucesso!");
        }
        else {
            System.out.println("Não foi possível aprovar a solicitação, pois você não é gerente.");
        }
    }
}
