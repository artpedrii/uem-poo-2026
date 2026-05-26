package com.tutu;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(TipoUsuario.PADRAO, "Arthur");
        Usuario usuario2 = new Usuario(TipoUsuario.ADMIN, "Maria");
        SistemaAcao sistema1 = new SistemaAcao(usuario1, null);
        SistemaAcao sistema2 = new SistemaAcao(usuario2, null);

        System.out.println("Usuário 1:");
        sistema1.comentar();
        sistema1.exibirComentário();

        System.out.println("\nUsuário 2:");
        sistema2.comentar();
        sistema2.exibirComentário();
    }
}