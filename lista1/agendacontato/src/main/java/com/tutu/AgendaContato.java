package com.tutu;

public class AgendaContato {
    //atributos
    private String nome;
    private String telefone;
    private String email;

    //getters
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //metodos 
    public void exibirContato(){
        System.out.println("================================");
        System.out.println("DADOS DO CONTATO: ");
        System.out.println("Nome: " + nome);
        System.out.println("Número de telefone: " + telefone);
        System.out.println("E-mail: " + email);
        System.out.println("================================");
    }
    public void atualizarTelefone(String novoTelefone){
        telefone = novoTelefone; 
    }
}