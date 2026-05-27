package com.tutu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> listaContato = new ArrayList<Contato>();
        ContatoPessoal contatoPessoal = new ContatoPessoal("João", "Pessoal", "123456789", "Amigo de longa data", "Amigo", "@joao");
        ContatoProfissional contatoProfissional = new ContatoProfissional("Maria", "Profissional", "987654321", "Colega de trabalho", "Empresa XYZ", "111222333");
        ContatoPessoal contatoPessoal2 = new ContatoPessoal("Ana", "Pessoal", "555555555", "Prima", "Prima", "@ana");
        ContatoProfissional contatoProfissional2 = new ContatoProfissional("Carlos", "Profissional", "444444444", "Chefe", "Empresa ABC", "222333444");
        listaContato.add(contatoPessoal);
        listaContato.add(contatoProfissional);
        listaContato.add(contatoPessoal2);
        listaContato.add(contatoProfissional2);

        System.out.println("Exibição normal: ");
        //exibicao geral
        for (Contato contato_temp: listaContato){
            contato_temp.exibirDados();
        }

        System.out.println("\nExibição de contatos profissionais: ");
        //exibicao profissional
        for (Contato contato_temp : listaContato) {
            if (contato_temp.getTipo().equals("Profissional")){
                contato_temp.exibirDados();
            }
        }
    }
}