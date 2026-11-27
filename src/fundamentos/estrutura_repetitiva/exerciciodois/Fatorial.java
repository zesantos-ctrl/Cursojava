package estrutura_repetitiva.exerciciodois;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        int fat = 1;
        for (int i = 0; i < n; i++) {
            fat *= i;
        }
        System.out.println(fat);
    }
}
