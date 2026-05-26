package com.tutu;

public class BibliotecaSys {
    //metodo
    public void emprestar(Aluno aluno, Livro livro){
        if (aluno.getStatusAtual() == StatusAluno.ATIVO) {
            if (livro.getStatusLivro() == StatusLivro.DISPONIVEL) {
                livro.setStatusLivro(StatusLivro.EMPRESTADO);
                System.out.println("Livro emprestado com sucesso!");
            }
            else {
                System.out.println("Livro indisponível.");
            }
        }
        else {
            System.out.println("Não foi possível realizar a ação. Aluno inativo.");
        }
    }
}
