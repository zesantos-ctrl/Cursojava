package atividade.ifelse;

import java.util.Scanner;

public class Negativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        if (numero >= 0) {
            System.out.println("Não negativo");
        } else {
            System.out.println("negativo");
        }
    }
}
