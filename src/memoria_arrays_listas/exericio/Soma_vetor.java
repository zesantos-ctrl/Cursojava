package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = teclado.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = teclado.nextDouble();
        }

        System.out.println();
        double sum = 0.0;
        System.out.print("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", vect[i]);
            sum += vect[i];
        }
        System.out.println();
        System.out.printf("Soma = %.2f", sum);
        System.out.println();
        double avg = sum / n;
        System.out.printf("Media de altura: %.2f%n", avg);
    }
}
