package com.tutu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //criação do contato
        AgendaContato contato1 = new AgendaContato();
        System.out.println("Digite o nome do conato: ");
        String nomeContato = leitor.nextLine();
        contato1.setNome(nomeContato);
        System.out.println("Digite o telefone do conato: ");
        String telefoneContato = leitor.nextLine();
        contato1.setTelefone(telefoneContato);
        System.out.println("Digite o e-mail do conato: ");
        String emailContato = leitor.nextLine();
        contato1.setEmail(emailContato);

        //exibição de dados
        contato1.exibirContato();

        //atualização de telefone
        System.out.println("Digite o telefone atualizado do conato: ");
        String novoTelefoneContato = leitor.nextLine();
        contato1.setTelefone(novoTelefoneContato);

        //nova exibição de dados
        contato1.exibirContato();
    }
}