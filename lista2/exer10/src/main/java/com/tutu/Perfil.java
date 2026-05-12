package com.tutu;

public class Perfil {
    private String bio;
    private String foto;
    private int visibilidade;
    
    //construtores
    public Perfil(String bio, String foto, int visibilidade) {
        this.bio = bio;
        this.foto = foto;
        this.visibilidade = visibilidade;
    }

    //getters
    public String getBio() {
        return bio;
    }
    public String getFoto() {
        return foto;
    }
    public int getVisibilidade() {
        return visibilidade;
    }
    
    //metodos
    public void exibirPerfil(){
        System.out.println("Biografia: " + bio);
        System.out.println("Foto: " + foto);
        System.out.println("Visibilidade " + visibilidade);
    }
}