package com.tutu;

public class Atividade {
    private String descricao;
    private String hora;
    private DiaSemana dia;

    public Atividade(String descricao, String hora, DiaSemana dia) {
        this.descricao = descricao;
        this.hora = hora;
        this.dia = dia;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }
    public String getHora() {
        return hora;
    }
    public DiaSemana getDia() {
        return dia;
    }
    
}
