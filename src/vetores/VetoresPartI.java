package vetores;

import java.util.Scanner;

public class   VetoresPartI {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        double[] vect = new double[n]; // vetor
                            // tamanho do vetor
        for (int i = 0; i < n; i++) {
            vect[i] = teclado.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        teclado.close();
    }
}
