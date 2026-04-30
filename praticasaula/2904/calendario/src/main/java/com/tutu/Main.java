package com.tutu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        DiaSemana dia = DiaSemana.SEXTA; 
        //NivelAcesso admin = NivelAcesso.ADMIN;
        NivelAcesso acesso = NivelAcesso.ADMIN;
        //Atividade atv1 = new Atividade("Dar uma lição no gusta.", "10:59", dia);

        //O sistema deve permitir a criacao de atividades somente por um usuario.
        if (acesso == NivelAcesso.USUARIO){
            System.out.println("Acesso permitido");        
        }
        else {
            System.out.println("Acesso negado");
        }
    }   
}