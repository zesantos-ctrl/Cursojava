package atividade.vetor;

import java.util.Scanner;

public class SomarVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        double soma, media;
        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = teclado.nextDouble();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        media = soma / n;
        System.out.print("VALORES =  ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", media);
        System.out.printf("MEDIA = %.2f\n", soma);

    }
}
