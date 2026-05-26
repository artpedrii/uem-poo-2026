package com.tutu;

import java.util.Scanner;

public class SistemaAcao {
    private Usuario usuario;
    private Scanner leitor;
    //construtor 
    public SistemaAcao(Usuario usuario, Scanner leitor) {
        this.usuario = usuario;
        this.leitor = new Scanner(System.in);
    }

    //getter
    public Usuario getUsuario() {
        return usuario;
    }

    //metodo 
    String comentario = "";
    public void comentar(){
        if (usuario.getTipoUsuario() ==  TipoUsuario.PADRAO) {
            System.out.println("Realize seu comentário: ");
            comentario = leitor.nextLine();
        }
        else {
            System.out.println("Acesso negado.");
        }
    }

    public void exibirComentário(){
        if (usuario.getTipoUsuario() == TipoUsuario.PADRAO){
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Comentou: ");
            System.out.printf("%s\n", comentario);
        }
        else {
            System.out.println("Acesso negado. Comentário não disponível.");
        }
    }

}
