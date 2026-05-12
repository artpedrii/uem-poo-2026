package com.tutu;

public class Main {
    public static void main(String[] args) {
        PlacaMae placa1 = new PlacaMae("Z790", "Intel");
        Computador computador1 = new Computador("Asus", "I7", placa1);
        computador1.exibirConfiguracao();
    }
}