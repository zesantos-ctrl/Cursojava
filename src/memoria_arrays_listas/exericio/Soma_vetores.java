package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class Soma_vetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = teclado.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            a[i] = teclado.nextInt();

        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            b[i] = teclado.nextInt();
        }

        for (int i = 0; i < n; i++) {

            c[i] = a[i] + b[i];
        }

        System.out.println("Valor resultante: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d\n", c[i]);
        }
    }
}
