package poo_basico.memoria_arrays_listas.vetores;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = teclado.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("Media de altura: %.2f%n", avg);
        teclado.close();
    }
}
