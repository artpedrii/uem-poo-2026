package com.tutu;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    
    //construtores
    public Endereco(String rua, int numero, String bairro, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    //getters
    public String getRua() {
        return rua;
    }
    public int getNumero() {
        return numero;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }

    //metodo
    public void exibirEndereco(){
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
    } 
}
