package com.tutu;

public class Usuario {
    private String login;
    private String email;
    private Perfil perfil;

    //construtor
    public Usuario(String login, String email, Perfil perfil) {
        this.login = login;
        this.email = email;
        this.perfil = perfil;
    }

    //getters
    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
    public Perfil getPerfil() {
        return perfil;
    }

    //metodos
    public void exibirUsuario(){
        System.out.println("Login: " + login);
        System.out.println("E-mail: " + email);
        perfil.exibirPerfil();
    }
    
}
