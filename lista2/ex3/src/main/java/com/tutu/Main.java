package com.tutu;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Combustão interna", 1600, "67676767");
        Carro carro = new Carro("Hyundai", "HB20", motor);
        carro.ligarCarro();
        carro.exibirFichaTecnica();
    }
}