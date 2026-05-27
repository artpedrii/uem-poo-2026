package com.tutu;

import java.util.List;
import java.util.ArrayList;

public class Sys {
    private List<Usuario> listaUsuarios;

    //construtor
    public Sys(List<Usuario> listaUsuarios) {
        this.listaUsuarios = new ArrayList<Usuario>();
    }

    //getter
    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    //metodo
    public void criarUsuario(Usuario criador, String nome, TipoUsuario tipo){
        if (criador.getTipo() == TipoUsuario.ADMIN){
            if (tipo == TipoUsuario.PADRAO){
                Usuario user = new Usuario(nome, tipo);
                listaUsuarios.add(user);
                System.out.println("Usuário registrado com sucesso!");
            }
            else {
                System.out.println("Apenas usuários do tipo padrão podem ser criados.");
            }
        }
        else {
            System.out.println("Apenas ADMINS podem criar usuários.");
        }
    }
}
