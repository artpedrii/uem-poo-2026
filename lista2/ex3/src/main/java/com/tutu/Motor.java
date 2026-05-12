package com.tutu;

public class Motor {
    private String tipo;
    private int potencia;
    private String numeroSerie; 

    //construtor
    public Motor(String tipo, int potencia, String numeroSerie){
        this.tipo = tipo;
        this.potencia = potencia;
        this.numeroSerie = numeroSerie; 
    }

    //getters
    public String getTipo() {
        return tipo;
    }
    public int getPotencia() {
        return potencia;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }

    //metodo
    public void exibirInformacoesMotor(){
        System.out.println("Tipo do motor: " + tipo);
        System.out.println("Potência do motor: "+ potencia);
        System.out.println("Número de série do motor: "+ numeroSerie);
    }
}
