package com.tutu;

public class Podcast extends Midia {
    private String apresentador;

    //construtor
    public Podcast(String titulo, String ano, String apresentador) {
        super(titulo, ano);
        this.apresentador = apresentador;
    }

    //getter
    public String getApresentador() {
        return apresentador;
    }

    //metodo
    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Apresentador: " + apresentador);
    }
}
