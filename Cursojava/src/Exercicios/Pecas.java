package Exercicios;

import java.util.Scanner;

public class Pecas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cod1;
        int cod2;
        int qte1;
        int qte2;

        double preco1, preco2, total;

        cod1 = teclado.nextInt();
        qte1 = teclado.nextInt();
        preco1 = teclado.nextDouble();

        cod2 = teclado.nextInt();
        qte2 = teclado.nextInt();
        preco2 = teclado.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.println("Valor a pagar: " + total);
    }
}
