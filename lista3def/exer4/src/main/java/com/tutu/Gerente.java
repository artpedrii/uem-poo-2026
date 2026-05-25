package com.tutu;

public class Gerente extends Funcionario {
    private String setor;


    //construtor
    public Gerente(String nome, int salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    //getters
    public String getSetor() {
        return setor;
    }

    //metodo
    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
        System.out.println("Setor: " + setor);
    }
}
