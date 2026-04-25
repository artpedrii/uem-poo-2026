package com.tutu;  

public class LivroBiblioteca {
    //atributos
    private String titulo;
    private String autor;
    private String codigo;
    private boolean disponivel = true; //começa sempre disponível

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getCodigo() {
        return codigo;
    }
    public boolean getDisponivel() {
        return disponivel;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    //metodos
    public void emprestar(){
        if (disponivel == true) {
            System.out.println("Livro emprestado com sucesso.");
            disponivel = false;
        }
        else {
            System.out.println("Livro já está emprestado.");
        }
    }
    public void devolver(){
        if (disponivel == false) {
            System.out.println("Livro devolvido com sucesso.");
            disponivel = true;
        }
        else {
            System.out.println("Livro já disponível.");
        }
    }
    public void exibirInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        if (disponivel == true){
           System.out.println("Situação: Disponível para empréstimo."); 
        }
        else {
            System.out.println("Situação: Indisponível para empréstimo no momento.");
        }
        System.out.println("==========================================");
    }
}