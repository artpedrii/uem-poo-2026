package com.tutu;

import java.util.List;

public class Vetor {
    private List<Integer> elementos;

    //construtor
    public Vetor(List<Integer> elementos) {
        this.elementos = elementos;
    }
    
    //getter
    public List<Integer> getElementos() {
        return elementos;
    }

    //metodo
    public void ordena(){
        for (int j = 0; j < (elementos.size() - 1); j++){
            for (int i = 0; i < (elementos.size() - 1); i++){
                if (elementos.get(i) >= elementos.get(i + 1)){
                    int pivo = elementos.get(i);
                    elementos.set(i, elementos.get(i + 1)) ;
                    elementos.set(i + 1, pivo);
                }
            }
        }
    }
    public void exibirVetor(){
        for (int i = 0; i < elementos.size(); i++){
            System.out.printf("%d ", elementos.get(i));
        }
    }
}
