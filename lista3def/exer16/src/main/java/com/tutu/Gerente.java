package com.tutu;

public class Gerente extends Funcionario{
    private String cargo;
    private String areaSupervisao;
    private double bonus;
    private int quantidadeEquique;
    
    //construtor
    public Gerente(String nome, double salario, String cargo, String areaSupervisao, double bonus, int quantidadeEquique) {
        super(nome, salario);
        this.cargo = cargo;
        this.areaSupervisao = areaSupervisao;
        this.bonus = bonus;
        this.quantidadeEquique = quantidadeEquique;
    }

    //getters
    public String getCargo(){
        return cargo;
    }
    public String getAreaSupervisao() {
        return areaSupervisao;
    }
    public double getBonus() {
        return bonus;
    }
    public int getQuantidadeEquique() {
        return quantidadeEquique;
    }

    //metodo
    @Override
    public void exibirDados(){
        System.out.println("========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + getSalario());
        System.out.println("========================");
    }
    
}
