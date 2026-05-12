package com.tutu;

public class Main {
    public static void main(String[] args) {
        ISBN isbn1 = new ISBN("67676767-7", "Editora Burguer");
        Livro livro1 = new Livro("Munir Berg", "Munir B Shehadeh", isbn1);
        livro1.exibirDados();
    }
}