package com.tutu;

public class Prontuario{
    private int numeroRegistro;
    private String tipoSanguineo;
    private String alergias;
    
    //construtores
    public Prontuario(int numeroRegistro, String tipoSanguineo, String alergias) {
        this.numeroRegistro = numeroRegistro;
        this.tipoSanguineo = tipoSanguineo;
        this.alergias = alergias;
    }

    //getters
    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public String getAlergias() {
        return alergias;
    }

    //metodo
    public void exibirDadosProntuario(){
        System.out.println("Número de registro: " + numeroRegistro);
        System.out.println("Tipo sanguínero: " + tipoSanguineo);
        System.out.println("Alergias: " + alergias);
    }
    
}