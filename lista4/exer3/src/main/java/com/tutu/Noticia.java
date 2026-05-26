package com.tutu;

public class Noticia {
    private String titulo;
    private String descricao;
    
    //construtor
    public Noticia(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    //getters
    public String getTitulo(){
        return titulo;
    }
    public String getDescricao(){
        return descricao;
    }

    //metodo
    public void exibirNoticia(){
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
    }
}
