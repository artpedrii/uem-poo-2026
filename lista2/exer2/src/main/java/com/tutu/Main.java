package com.tutu;

public class Main {
    public static void main(String[] args) {
        Carteirinha caraluno1 = new Carteirinha();
        caraluno1.setNumero("145100");
        caraluno1.setDataEmissao("31/03/2025");
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Arthur");
        aluno1.setCurso("Ciência da Computação");
        aluno1.setCarteirinha(caraluno1);  
        aluno1.exibirDados();
    }
}