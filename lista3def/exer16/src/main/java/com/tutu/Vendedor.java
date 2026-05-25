package com.tutu;

public class Vendedor extends Funcionario {
    private String cargo;
    private String setor;
    private double comissao;
    
    //construtor
    public Vendedor(String nome, double salario, String cargo, String setor, double comissao) {
        super(nome, salario);
        this.cargo = cargo;
        this.setor = setor;
        this.comissao = comissao;
    }

    //getters
    public String getCargo() {
        return cargo;
    }
    public String getSetor() {
        return setor;
    }
    public double getComissao() {
        return comissao;
    }

    //metodo
    @Override
    public void exibirDados() {
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + getSalario());
        System.out.println("========================");
        
    }
}
