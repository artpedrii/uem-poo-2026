package com.tutu;

public class ContatoProfissional extends Contato {
    private String empresa;
    private String telefoneTrabalho;
    
    //construtor
    public ContatoProfissional(String nome, String tipo, String telefone, String descricao, String empresa,
            String telefoneTrabalho) {
        super(nome, tipo, telefone, descricao);
        this.empresa = empresa;
        this.telefoneTrabalho = telefoneTrabalho;
    }

    //getters
    public String getEmpresa() {
        return empresa;
    }
    public String getTelefoneTrabalho() {
        return telefoneTrabalho;
    }

    //metodo
    @Override
    public void exibirDados(){
        System.out.println("==============================");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Tipo do contato: " + getTipo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Relação: " + empresa);
        System.out.println("Descrição: " + telefoneTrabalho);
        System.out.println("==============================");
    }
}
