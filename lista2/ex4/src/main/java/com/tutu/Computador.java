package com.tutu;

public class Computador {
    private String marca;
    private String processador;
    private PlacaMae placaMae;

    //construtor
    public Computador(String marca, String processador, PlacaMae placaMae){
        this.marca = marca;
        this.processador = processador;
        this.placaMae = placaMae;
    }

    //getters
     public String getMarca() {
        return marca;
    }
    public String getProcessador() {
        return processador;
    }
    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    //metodos
    public void exibirConfiguracao(){
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Placa mãe chipset: " + placaMae.getChipset());
        System.out.println("Placa mãe modelo: " + placaMae.getModelo());
    }
}
