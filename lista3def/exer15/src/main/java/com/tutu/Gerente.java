package com.tutu;

public class Gerente extends Funcionario {
    private String area;
    private double bonus;
    private int membrosEquipe;
    
    //construtor
    public Gerente(String nome, int idade, double salario, String area, double bonus, int membrosEquipe) {
        super(nome, idade, salario);
        this.area = area;
        this.bonus = bonus;
        this.membrosEquipe = membrosEquipe;
    }

    //getters
    public String getArea() {
        return area;
    }
    public double getBonus() {
        return bonus;
    }
    public int getMembrosEquipe() {
        return membrosEquipe;
    }

    //metodo
    @Override
    public void exibirDados() {
        System.out.println("==========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: " + getSalario());
        System.out.println("Área de supervisão: " + area);
        System.out.println("Bônus: "  + bonus);
        System.out.println("Tamanho da equipe: " + membrosEquipe);
        System.out.println("==========================");
        
    }
}
