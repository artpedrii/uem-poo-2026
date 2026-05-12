package com.tutu;

public class Main {
    public static void main(String[] args) {
        Perfil perfil1 = new Perfil("l'appel du vide", "sonic descalço", 1000000);
        Usuario usuario1 = new Usuario("artpedrii", "tutu@email.com.br", perfil1);
        usuario1.exibirUsuario();
    }
}