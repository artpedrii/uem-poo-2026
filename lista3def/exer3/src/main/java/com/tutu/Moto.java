package com.tutu;

public class Moto extends Veiculo {
    private int cilindradas;

    //construtor
    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    //getters
    public int getCilindradas() {
        return cilindradas;
    }

    //metodo
    public void exibirDadosVeiculo(){
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + cilindradas);
    }
}
