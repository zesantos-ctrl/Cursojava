package Exercicios.membroestatic.dolar;

import java.util.Scanner;

public class Cotacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dolar = teclado.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmount = teclado.nextDouble();

        double totalReais = Conversao.convertToReais(dolar, dollarAmount);

        System.out.printf("Amount to be paid in reais = %.2f%n", totalReais);

        teclado.close();

    }
}
