package atividade.abstracts.app;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Individual or company (i/c)? ");

        }

        teclado.close();
    }
}
