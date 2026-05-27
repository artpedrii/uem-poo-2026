package com.tutu;

public class Main {
    public static void main(String[] args) {
        Sys sistema = new Sys(null);
        Usuario admin = new Usuario("Admin", TipoUsuario.ADMIN);
        sistema.criarUsuario(admin, "User1", TipoUsuario.PADRAO);   
        Usuario padrao = new Usuario("User2", TipoUsuario.PADRAO);
        sistema.criarUsuario(padrao, "User3", TipoUsuario.PADRAO);
        sistema.criarUsuario(admin, "User4", TipoUsuario.ADMIN);
    }
}