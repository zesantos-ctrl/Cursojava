package atividade.repfors;

import java.util.Scanner;

public class Casos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        for (int i = 0; i < n; i++) {

            double a = teclado.nextDouble();
            double b = teclado.nextDouble();
            double c = teclado.nextDouble();
            // peso 2 peso 3 peso 5
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        teclado.close();
    }
}
