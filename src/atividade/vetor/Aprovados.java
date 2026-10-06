package atividade.vetor;

import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Quantos alunos serao digitados? ");
        n = teclado.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] nota = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
        }
    }
}
