package exercicios;

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nmenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = teclado.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %d a pesssoa: \n", i + 1);
            teclado.nextLine();
            System.out.print("Nome: ");
            nome[i] = teclado.nextLine();
            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
            System.out.println("Altura: ");
            altura[i] = teclado.nextDouble();
        }

        nmenores = 0;
        alturaTotal = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                nmenores++;
            }
            alturaTotal += altura[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }
        teclado.close();
    }
}
