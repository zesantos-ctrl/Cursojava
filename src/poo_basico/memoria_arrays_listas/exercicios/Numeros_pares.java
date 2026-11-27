package exercicios;

import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = teclado.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = teclado.nextInt();
        }

        System.out.println("Numeros pares: ");
        int contador = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%d ", vect[i]);
                contador++;
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + contador);

    }
}
