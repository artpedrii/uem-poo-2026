package com.tutu;

public class Estagiario extends Funcionario {
    private String curso;
    private String universidade;
    private String matricula;
    private String anosContrato;
    
    //construtor
    public Estagiario(String nome, int idade, double salario, String curso, String universidade, String matricula, String anosContrato) {
        super(nome, idade, salario);
        this.curso = curso;
        this.universidade = universidade;
        this.matricula = matricula;
        this.anosContrato = anosContrato;
    }

    //getters
    public String getCurso() {
        return curso;
    }
    public String getUniversidade() {
        return universidade;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getAnosContrato() {
        return anosContrato;
    }
    
    //metodo
    @Override
    public void exibirDados(){
        System.out.println("==========================");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salário: " + getSalario());
        System.out.println("Curso: " + curso);
        System.out.println("Universidade: " + universidade);
        System.out.println("Tempo de contrato: " + anosContrato + "anos.");
        System.out.println("==========================");
    }
    
}
