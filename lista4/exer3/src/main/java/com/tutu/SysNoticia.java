package com.tutu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SysNoticia {
    //private Usuario usuario;
    private List<Noticia> listaNoticas;
    private Scanner leitor;
    
    //construtor
    public SysNoticia(List<Noticia> listaNoticas, Scanner leitoScanner) {
       // this.usuario = usuario;
        this.listaNoticas = new ArrayList<Noticia>();
        this.leitor = new Scanner(System.in);
    }

    //getters
    public List<Noticia> getListaNoticas() {
        return listaNoticas;
    }

    //metodo
    public void registrarNoticia(Usuario user){
        if (user.getTipo() == TipoUsuario.ADMIN) {
            System.out.println("Digite o título da noticia: ");
            String titulo = leitor.nextLine();
            System.out.println("Digite o conteúdo da noticia: ");
            String descricao = leitor.nextLine();
            Noticia noticia = new Noticia(titulo, descricao);
            listaNoticas.add(noticia);
        }
        else {
            System.out.println("Sem permissão para criar notícia.");
        }
    }
    
    public void exibirNoticias(Usuario user){
        for (Noticia noticia_temp : listaNoticas){
            noticia_temp.exibirNoticia();
        }
    }
    

    
}
