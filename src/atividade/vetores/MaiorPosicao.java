package atividade.vetores;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, posmaior;
        double maior;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = teclado.nextDouble();
        }

        maior = vetor[0];
        posmaior = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);

        teclado.close();
    }
}
