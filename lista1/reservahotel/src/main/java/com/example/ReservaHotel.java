package com.example;

public class ReservaHotel {

    //atributos
    private String nomeHospede;
    private int quantidadeDias;
    private double valorDiaria = 170.0;

    //getters
    public String getNomeHospede(){
        return nomeHospede;
    }
    public int getQuantidadeDias(){
        return quantidadeDias;
    }
    public double getValorDiaria(){
        return valorDiaria;
    }
    
    //setters
    public void setNomeHospede(String nomeHospede){
        this.nomeHospede = nomeHospede;
    }
    public void setQuantidadeDias(int quantidadeDias){
        this.quantidadeDias = quantidadeDias;
    }
    //public void setValorDiaria(double valorDiaria){   obs: valor da diária já definido
    //   this.valorDiaria = valorDiaria;
    //}

    //metodos 
    public double calcularTotalHospedagem(){
        return (quantidadeDias * valorDiaria); 
    }
    public void exibirReserva(){
        System.out.println("Nome do hóspede: " + nomeHospede);
        System.out.println("Quantidade de dias reservados: " + quantidadeDias);
        System.out.println("Valor total da hospedagem: " + calcularTotalHospedagem());
    }
}
