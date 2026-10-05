package atividade.vetores;

import java.util.Scanner;

public class SomarVetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = teclado.nextDouble();
        }

        double soma = 0.0; 
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma / n;
        System.out.printf("VALORES = %d\n", vect[n]);
        System.out.printf("SOMA = %d\n", media);
        System.out.printf("MEDIA = %d\n", soma);

    }
}
