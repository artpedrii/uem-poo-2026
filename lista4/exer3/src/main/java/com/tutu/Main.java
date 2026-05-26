package com.tutu;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", TipoUsuario.ADMIN);
        Usuario usuario2 = new Usuario("Maria", TipoUsuario.VISITANTE);
        SysNoticia sysNoticia1 = new SysNoticia(null, null);
        sysNoticia1.registrarNoticia(usuario1);
        sysNoticia1.registrarNoticia(usuario2);
        sysNoticia1.exibirNoticias(usuario1);
        sysNoticia1.exibirNoticias(usuario2);

    }
}