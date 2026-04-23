package com.example; 

public class Filme {
    private String titulo;
    private String genero;
    private String duracao;
    private int avaliacao;

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getGenero() {
        return genero;
    }
    public String getDuracao() {
        return duracao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    //metodos
    public void exibirFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao);
        System.out.println("Avaliação: " + avaliacao);
    }
    public void alterarAvalicao(int novaAvaliacao){
        if (novaAvaliacao < 0 || novaAvaliacao > 10) {
            System.out.println("Avaliação inválida. A avaliação deve ser entre 0 e 10.");
        } 
        else {
            setAvaliacao(novaAvaliacao);
            System.out.println("Avaliação atualizada.");
        }
    }
}    