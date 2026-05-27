package com.tutu;

public class Musica extends Midia {
    private String artista;

    //construtor
    public Musica(String titulo, String ano, String artista) {
        super(titulo, ano);
        this.artista = artista;
    }

    //getter
    public String getArtista() {
        return artista;
    }

    //metodo
    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Artista: " + artista);
    }
}
