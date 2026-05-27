package com.tutu;

public class Main {
    public static void main(String[] args) {
        Sys sistema = new Sys(null, null);
        Usuario user1 = new Usuario("João");
        Usuario user2 = new Usuario("Maria");
        sistema.registrarAtividade(user1);
        sistema.registrarAtividade(user2);
        sistema.registrarAtividade(user2);
        sistema.removerAtividade(user1, sistema.getListaAtividades().get(0));
        sistema.removerAtividade(user1, sistema.getListaAtividades().get(1));
        sistema.registrarAtividade(user2);
        sistema.registrarAtividade(user2);
        sistema.removerAtividade(user2, sistema.getListaAtividades().get(2));
    }
}