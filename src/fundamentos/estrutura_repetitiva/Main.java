package estrutura_repetitiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*
         * While
         * int x = teclado.nextInt();
         * int soma = 0;
         * while (x != 0) {
         * soma += x;
         * x = teclado.nextInt();
         * }
         * System.out.println(soma);
         */

        int n = teclado.nextInt();

        int soma = 0;
        for (int i = 0; i < n; i++) {
            int x = teclado.nextInt();
            soma += x;
        }
        System.out.println(soma);

        for (int i = 4; i < 0; i--) {
            System.out.println("Valor de i: " + i);
        }
        teclado.close();
    }
}
