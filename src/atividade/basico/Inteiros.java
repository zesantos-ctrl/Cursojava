package atividade.basico;

import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = teclado.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = teclado.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int c = teclado.nextInt();

        System.out.println("Digite o quarto numero: ");
        int d = teclado.nextInt();

        int diferanca = (a*b-c*d);
        System.out.println(diferanca);
        teclado.close();
    }
}
