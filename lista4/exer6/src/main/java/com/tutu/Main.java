package com.tutu;

public class Main {
    public static void main(String[] args) {
        Sys sistema = new Sys(null);

        Turma turma = new Turma("Matemática", 101);
        Professor professor = new Professor("Dr. Smith", turma, "Matemática");
        Nota nota = new Nota(9.5);

        Professor professor2 = new Professor("Dr. Johnson", turma, "Física");
        Turma turma2 = new Turma("Física", 102);
        Nota nota2 = new Nota(8.0);

        sistema.cadastrarNota(professor, turma, nota); // Deve registrar a nota com sucesso
        sistema.cadastrarNota(professor2, turma, nota2); // Deve falhar ao registrar a nota, pois o curso do professor é diferente do curso da turma
    }

    //TESTE LINUX 
}