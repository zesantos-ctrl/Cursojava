package Exercicios.poo;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Aluno aluno = new Aluno();
        aluno.nota1 = teclado.nextDouble();
        aluno.nota2 = teclado.nextDouble();
        aluno.nota3 = teclado.nextDouble();

        System.out.printf("Final grade: %.2f%n", aluno.finalNota());

        if (aluno.finalNota() < 60.0) {
            System.out.println("Failed");
            System.out.printf("Missing %.2f point5n", aluno.finalNota());
        } else {
            System.out.println("PASS");
        }
        teclado.close();

    }
}
