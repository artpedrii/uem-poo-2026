package com.tutu;

public class ContatoPessoal extends Contato {
    private String relacao;
    private String instagram;

    //construtor
    public ContatoPessoal(String nome, String tipo, String telefone, String descricao, String relacao, String instagram) {
        super(nome, tipo, telefone, descricao);
        this.relacao = relacao;
        this.instagram = instagram;
    }

    //getter
    public String getRelacao() {
        return relacao;
    }

    public String getInstagram() {
        return instagram;
    }

    //metodo
    @Override
    public void exibirDados(){
        System.out.println("==============================");
        System.out.println("Nome: " + getNome());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Tipo do contato: " + getTipo());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Relação: " + relacao);
        System.out.println("Descrição: " + instagram);
        System.out.println("==============================");
    }
}
