package memoria_arrays_listas.exericio;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = teclado.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            System.out.print("Nome: ");
            teclado.nextLine();
            nome[i] = teclado.nextLine();
            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();
        }

        int maior = idade[0];
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (idade[i] > 18) {
                maior = idade[i];
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s\n", nome[posicao]);

    }

}
