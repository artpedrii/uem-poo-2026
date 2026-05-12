package com.tutu;

public class Livro {
    private String titulo;
    private String autor;
    private ISBN isbn;
    
    //construtor
    public Livro(String titulo, String autor, ISBN isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public ISBN getIsbn() {
        return isbn;
    }

    //metodo
    public void exibirDados(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + isbn.getCodigo());
        System.out.println("Editora: " + isbn.getEditora());
    }
}
