package com.tutu;

public class LivroDidatico extends Livro {
    private String disciplina;

    //construtor
    public LivroDidatico(String titulo, String autor, String disciplina) {
        super(titulo, autor);
        this.disciplina = disciplina;
    }

    //get
    public String getDisciplina() {
        return disciplina;
    }

    //metodo
    @Override
    public void exibirDados(){
        System.out.println("================================");
        System.out.println("Nome do livro: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("================================");
    }
}
