package atividade.vetor;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println("NUMEROS NEGTIVOS: ");

        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.printf("%d\n", vetor[i]);
            }
        }
        teclado.close();
    }
}
