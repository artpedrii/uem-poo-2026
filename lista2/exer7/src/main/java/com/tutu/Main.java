package com.tutu;

public class Main {
    public static void main(String[] args) {
        Prontuario prontuario1 = new Prontuario(67, "O-", "Paracetamol, Dipirona, Amendoim");
        Paciente paciente1 = new Paciente("Arthur", 19, prontuario1);
        paciente1.exibirPaciente();
    }
}