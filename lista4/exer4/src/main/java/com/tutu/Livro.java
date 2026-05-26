package com.tutu;

public class Livro {
    private String titulo;
    private String autor;
    private StatusLivro statusLivro;
    
    //construtor
    public Livro(String titulo, String autor, StatusLivro statusLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.statusLivro = statusLivro;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public StatusLivro getStatusLivro() {
        return statusLivro;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setStatusLivro(StatusLivro statusLivro) {
        this.statusLivro = statusLivro;
    }
}
