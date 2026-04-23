package com.example;

public class Main {
    public static void main(String[] args) {
        //criação da reserva
        ReservaHotel reserva1 = new ReservaHotel();
        reserva1.setNomeHospede("Julia");
        reserva1.setQuantidadeDias(5);

        //exibição da reserva e valor total.
        reserva1.exibirReserva();
    }
}