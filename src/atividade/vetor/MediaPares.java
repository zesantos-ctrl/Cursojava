package atividade.vetor;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        double soma, media;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = teclado.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = teclado.nextDouble();
        }

        soma = 0;
        for (int i = 0; 0 < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMEDIA DOS PARES = %.1f\n", media);

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("NENHUM NUMERO PAR :");

            }
        }
        teclado.close();
    }
}
