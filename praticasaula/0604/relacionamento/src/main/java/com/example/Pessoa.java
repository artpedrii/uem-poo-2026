package com.example;

public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;
    
    public Pessoa(){

    }

    public Pessoa(String nome, String cpf, int idade, Endereco endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.endereco = endereco; 
    }

    public String getnome(){
        return this.nome;
    }
    public String getcpf(){
        return this.cpf;
    }
    public int getidade(){
        return this.idade;
    }
    public Endereco getendereco(){
        return this.endereco;
    }

    //public void setvariavelEndereco(Endereco varivaelEndereco){
        //this.endereco = endereco;  
    //}

}
    