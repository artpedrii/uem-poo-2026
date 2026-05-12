package com.tutu;

public class Main {
    public static void main(String[] args) {
        CNPJ cnpj1 = new CNPJ("676767", "Regular");
        Empresa empresa1 = new Empresa("ABC Comércio de Alimentos LTDA", "Padaria do João", cnpj1);
        empresa1.exibirEmpresa();
    }
}