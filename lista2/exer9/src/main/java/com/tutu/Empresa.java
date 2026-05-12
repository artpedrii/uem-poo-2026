package com.tutu;

public class Empresa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;
    
    //construtores
    public Empresa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    //getters
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public CNPJ getCnpj() {
        return cnpj;
    }

    //metodo
    public void exibirEmpresa(){
        System.out.println("Razão social: " + razaoSocial);
        System.out.println("Nome fantasia: " + nomeFantasia);
        System.out.println("Número CNPJ: " + cnpj.getNumero());
        System.out.println("Situação cadastral: " + cnpj.getSituacaoCadastral());
    }
}
