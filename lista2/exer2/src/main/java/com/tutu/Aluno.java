package com.tutu;

public class Aluno {
    //atributos
    private String nome;
    private String curso;
    private Carteirinha carteirinha;

    //getters
    public String getNome() {
        return nome;
    }
     public String getCurso() {
        return curso;
    }
    public Carteirinha getCarteirinha() {
        return carteirinha;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setCarteirinha(Carteirinha carteirinha) {
        this.carteirinha = carteirinha;
    }

    //metodos
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        carteirinha.exibirDados();
    }
}
