package atividade.vetores;

import java.util.Scanner;

public class Alturaa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double altura, alturaMedia, perMenores;

        int n, nmenores;

        System.out.println("Quantas pessoas serao digitadas? ");
        n = teclado.nextInt();
        // [n] vai ser o tamanho que sera lido, ex: 2 = 2 valores a ser escrito
        // armazendo vetores
        String[] nome = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            // lendos vetores
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = teclado.next();
            System.out.print("Idade: ");
            idades[i] = teclado.nextInt();
            System.out.print("Alturas: ");
            alturas[i] = teclado.nextDouble();
        }

        nmenores = 0;
        altura = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            altura += alturas[i];
        }

        alturaMedia = altura / n;
        perMenores = ((double) nmenores / n) * 100;

        System.out.printf("\nAltura media  = 5.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %1f%%\n", perMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.printf("$s\n", nome[i]);
            }
        }
        teclado.close();
    }
}
