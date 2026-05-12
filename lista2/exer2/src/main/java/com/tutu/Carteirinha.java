package com.tutu;

public class Carteirinha {
    //atributos
    private String numero;
    private String dataEmissao;

    //getters
    public String getNumero() {
        return numero;
    }
    public String getDataEmissao() {
        return dataEmissao;
    }

    //setters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    //metodos 
    public void exibirDados(){
        System.out.println("===============================");
        System.out.println("Dados carteirinha:");
        System.out.println("Número: " + numero);
        System.out.println("Data de emissão: " + dataEmissao);
    }


}
