package Exercicios.ifelse;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("impar");
        }
        teclado.close();
    }
}
