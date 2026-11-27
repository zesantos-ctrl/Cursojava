package exercicios;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = teclado.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = teclado.nextInt();

        }

        System.out.println("Numeros negativos: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }
        teclado.close();
    }
}
