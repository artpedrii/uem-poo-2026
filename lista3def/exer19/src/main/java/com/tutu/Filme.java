package com.tutu;

public class Filme extends Midia {
    private String diretor;

    //construtor
    public Filme(String titulo, String ano, String diretor) {
        super(titulo, ano);
        this.diretor = diretor;
    }

    //getter
    public String getDiretor() {
        return diretor;
    }

    //metodo
    @Override
    public void exibirDetalhes() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano: " + getAno());
        System.out.println("Diretor: " + diretor);
    }
    
}
