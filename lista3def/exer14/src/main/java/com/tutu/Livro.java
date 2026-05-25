package com.tutu;

public abstract class Livro {
    private String titulo;
    private String autor;
    
    //construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }

    //metodo
    public abstract void exibirDados();
}
