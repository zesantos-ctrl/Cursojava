package estrutura_repetitiva.exerciciodois;

import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }
}
