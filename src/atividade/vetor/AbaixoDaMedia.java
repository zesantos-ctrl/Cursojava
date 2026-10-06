package atividade.vetor;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        double media, soma;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = teclado.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = teclado.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        media = soma / n;

        System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f\n", vetor[i]);
            }
        }
    }
}
