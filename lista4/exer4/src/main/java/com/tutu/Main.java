package com.tutu;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "12345", "Engenharia", StatusAluno.ATIVO);
        Aluno aluno2 = new Aluno("Maria", "67890", "Medicina", StatusAluno.INATIVO);
        Livro livro1 = new Livro("Java para Iniciantes", "Autor A", StatusLivro.DISPONIVEL);
        Livro livro2 = new Livro("Python Avançado", "Autor B", StatusLivro.DISPONIVEL);
        BibliotecaSys biblioteca = new BibliotecaSys();

        biblioteca.emprestar(aluno1, livro1); 
        biblioteca.emprestar(aluno1, livro2); 
        biblioteca.emprestar(aluno2, livro1); 
        biblioteca.emprestar(aluno1, livro1);
        
        //teste
    }
}