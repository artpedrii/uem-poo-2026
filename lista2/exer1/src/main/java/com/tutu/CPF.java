package com.tutu;

public class CPF {
    private String numero;
    private String situacao;

    //construtores 
   public CPF(String numero, String situacao) {
        this.numero = numero;
        this.situacao = situacao;
    }
    
    //getters
    public String getNumero(){
        return numero; 
    }
    public String getSituacao(){
        return situacao;
    } 

    //metodos
    public void exibirDadoscpf(){
        System.out.println("Número do CPF: " + numero);
        System.out.println("Situação CPF: " + situacao);
    }
}
