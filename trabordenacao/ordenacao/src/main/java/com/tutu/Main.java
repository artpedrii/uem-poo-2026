package com.tutu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList(List.of(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        Vetor v1 = new Vetor(numeros);
        v1.ordena();
        v1.exibirVetor();
        
}