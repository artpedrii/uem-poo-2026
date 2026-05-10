package com.tutu;

public class Vetor {
    private List elementos;

    //construtor
    public Vetor(int[] elementos) {
        this.elementos = elementos;
    }
    
    //getter
    public int[] getElementos() {
        return elementos;
    }

    //metodo
    public void ordena(){
        for (int j = 0; j < (elementos.length - 1); j++){
            for (int i = 0; i < (elementos.length - 1); i++){
                if (elementos[i] >= elementos[i + 1]){
                    int pivo = elementos[i];
                    elementos[i] = elementos[i + 1];
                    elementos[i + 1] = pivo;
                }
            }
        }
    }
    public void exibirVetor(){
        for (int i = 0; i < elementos.length; i++){
            System.out.printf("%d ", elementos[i]);
        }
    }
}
