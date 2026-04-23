package com.example;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidadePaginas;
    private boolean emprestado; 

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }
    public boolean getEmprestado() {
        return emprestado;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    //metodos
    public void emprestarLivro(){
        if (emprestado == false){
            System.out.println("Livro emprestado com sucesso!");
            emprestado = true;
        }
        else {
            System.out.println("Livro já está emprestado!");
        }
    }
    public void devolverLivro(){
        if (emprestado == true){
            System.out.println("Livro devolvido com sucesso!");
            emprestado = false; 
        }
        else {
            System.out.println("Livro já está disponível!");
        }
    }
    public void verificarDisponilidade(){
        if (emprestado == false){
            System.out.println("Livro disponível para empréstimo!");
        }
        else {
            System.out.println("Livro indisponível para empréstimo!");
        }
    }
}
