package exercicios;

import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = teclado.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = teclado.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < n; i++) {
            soma  += vect[i];
        }

        double media = soma / n;

        System.out.printf("\nMedia do vetor = %.3f\n",media);
        System.out.println("Elementos abaixo da media: ");

        for(int i = 0; i < n; i++){
            if(vect[i] < media) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

    }
}
