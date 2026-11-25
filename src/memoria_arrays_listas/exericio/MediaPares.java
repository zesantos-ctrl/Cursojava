package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = teclado.nextInt();

        int[] vect = new int[n];
        int soma, npares = 0;
        double media;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = teclado.nextInt();
        }

        soma = 0;
        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                npares++;
            }
        }

        if (npares == 0) {
            System.out.println("Nenhum numero é par");
        } else {
            media = (double) soma / npares;
            System.out.printf("MEDIA DOS PARES = %.1f\n", media);
        }

    }
}
