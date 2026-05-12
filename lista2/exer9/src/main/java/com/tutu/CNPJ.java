package com.tutu;

public class CNPJ {
    private String numero;
    private String situacaoCadastral;
    
    //construtores
    public CNPJ(String numero, String situacaoCadastral) {
        this.numero = numero;
        this.situacaoCadastral = situacaoCadastral;
    }

    //getters
    public String getNumero() {
        return numero;
    }
    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

}
