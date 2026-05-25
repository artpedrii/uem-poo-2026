package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        ArrayList<Professor> listaProfessores = new ArrayList<Professor>();
        Professor prof1 = new Professor("FA", 25000, "uber", 55);
        listaProfessores.add(prof1);
        Professor prof2  = new Professor("FA", 25000, "malbarbo", 49);
        listaProfessores.add(prof2);
        Professor prof3 = new Professor("FA", 25000, "josi", 43);
        listaProfessores.add(prof3);
        
        System.out.println("Escreva um nome: ");
        String nome = leitor.nextLine();

        boolean encontrado = false;
        for (Professor professorTemp : listaProfessores){
            professorTemp.exibirDados();
            if (professorTemp.getNome().equals(nome)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Professor encontrado!");
        }
        else {
            System.out.println("Professor não encontrado!");
        }
    }
}