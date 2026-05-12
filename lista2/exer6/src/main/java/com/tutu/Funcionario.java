package com.tutu;

public class Funcionario {
    private String nome;
    private String cargo;
    private Cracha cracha;
    
    //construtores
    public Funcionario(String nome, String cargo, Cracha cracha) {
        this.nome = nome;
        this.cargo = cargo;
        this.cracha = cracha;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public Cracha getCracha() {
        return cracha;
    } 

    //metodos
    public void exibirFuncionario(){
        System.out.println("========================================");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Código do crachá: " + cracha.getCodigo());
        System.out.println("Data de validade do crachá: " + cracha.getDataValidade());
        System.out.println("========================================");
    }
}
