package com.tutu;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    private List<Produto> listaProdutos;
    private Scanner leitor;

    // Construtor
    public SistemaCadastro(List<Produto> listaProdutos,Scanner leitor) {
        this.listaProdutos = new ArrayList<>();
        this.leitor = new Scanner(System.in);
    }

    //getters
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }
    public Scanner getLeitor() {
        return leitor;
    }
    //metodo
    public void cadastrarProduto(Usuario u){
        if (u.getTipo() == TipoUsuario.ADMIN) {
            System.out.println("Escreva o nome do produto: ");
            String nomeProduto = leitor.nextLine();
            System.out.println("Escreva o preço do produto: ");     
            double precoProduto = leitor.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto);
            listaProdutos.add(produto);
            System.out.println("Produto cadastrado com sucesso!");
        }
        else {
            System.out.println("Acesso negado. Apenas administradores podem cadastrar produtos.");
        }
    }
}
