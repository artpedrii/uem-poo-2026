package com.tutu;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", TipoUsuario.ADMIN);
        Usuario usuario2 = new Usuario("Maria", TipoUsuario.PADRAO);
        SistemaCadastro sistemaCadastro = new SistemaCadastro(null, null);
        sistemaCadastro.cadastrarProduto(usuario1);
        sistemaCadastro.cadastrarProduto(usuario2);
    }
}