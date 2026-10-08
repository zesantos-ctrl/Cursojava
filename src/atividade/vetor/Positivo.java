package atividade.vetor;

import java.util.Scanner;

public class Positivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = teclado.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = teclado.nextInt();
        }

        System.out.println("NUMERO NEGATIVOS: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < 0) {

            }
        }
        teclado.close();
    }
}
