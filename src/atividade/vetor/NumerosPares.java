package atividade.vetor;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, qtdpares;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        int[] pares = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            pares[i] = teclado.nextInt();
        }

        System.out.println("\nNUMERO PARES: ");

        qtdpares = 0; // variavel iniciada com 0
        for (int i = 0; i < n; i++) {
            if (pares[i] % 2 == 0) {
                System.out.printf("%d ", pares[i]);
                qtdpares++; // cada loop e true ele incrementa ate dar false e pular fora e mostrar quantos
                            // pares exitem

            }
        }
        System.out.printf("\nQUANTIDADE DE PARES = %d\n", qtdpares);

        teclado.close();
    }
}
