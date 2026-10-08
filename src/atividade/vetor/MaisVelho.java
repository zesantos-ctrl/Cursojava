package atividade.vetor;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n, maior, posicao;

        System.out.println("Quantas pessoas voce vai digitar: ");
        n = teclado.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome: ");
            nome[i] = teclado.nextLine();
            System.out.println("Idade: ");
            idade[i] = teclado.nextInt();
        }
        maior = idade[0];
        posicao = 0;

        for (int i = 0; i < n; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
                posicao = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicao]);
        teclado.close();
    }

}
