package com.tutu;

public class PlacaMae {
    private String chipset;
    private String modelo; 

    //construtor
    public PlacaMae(String chipset, String modelo){
        this.chipset = chipset;
        this.modelo = modelo;
    }

    //getters
    public String getChipset() {
        return chipset;
    }
    public String getModelo() {
        return modelo;
    }
    
}
