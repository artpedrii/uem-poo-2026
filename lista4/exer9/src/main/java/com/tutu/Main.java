package com.tutu;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("João", TipoUsuario.PADRAO);
        Usuario usuario2 = new Usuario("Maria", TipoUsuario.GERENTE);
        Sys sistema = new Sys(null, null);
        sistema.registraSolicitacao();
        sistema.registraSolicitacao();
        sistema.aprovarSolicitacao(usuario1, sistema.getListaSolcitacoes().get(0));
        sistema.aprovarSolicitacao(usuario2, sistema.getListaSolcitacoes().get(0));
    }
}