package com.tutu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Midia> listaMidias = new ArrayList<Midia>();

        //adicionando midias
        Midia  filme1 = new Filme("Inception", "2010", "Christopher Nolan");
        Midia musica1 = new Musica("Bohemian Rhapsody", "1975", "Queen");
        Midia podcast1 = new Podcast("The Daily", "2017", "Michael Barbaro");
        Midia podcast2 = new Podcast("Serial", "2014", "Sarah Koenig");
        listaMidias.add(filme1);
        listaMidias.add(musica1);
        listaMidias.add(podcast1);
        listaMidias.add(podcast2);

        //exibindo detalhes
        for (Midia midia_temp : listaMidias) {
            midia_temp.exibirDetalhes();
        }

        //exibir filmes
        for (Midia midia_temp : listaMidias) {
            if (midia_temp instanceof Filme) {
                midia_temp.exibirDetalhes();
            }
        }

        //contador 
        int quantidade_filmes = 0;
        int quantidade_podcast = 0;
        int quantidade_musica = 0;
        for (Midia midia_temp : listaMidias) {
            if (midia_temp instanceof Filme) {
                quantidade_filmes++;;
            }
            else if (midia_temp instanceof Musica) {
                quantidade_musica++;
            }
            else {
                quantidade_podcast++;
            }
        }
        System.out.println();
        System.out.println("Quantidade de filmes: " + quantidade_filmes);
        System.out.println("Quantidade de músicas: " + quantidade_musica);
         System.out.println("Quantidade de podcasts: " + quantidade_podcast);
    }
}