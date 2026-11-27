package matrizes;

import java.util.Scanner;

public class InteiroMatriz {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("");
        int m = teclado.nextInt();
        int n = teclado.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println();
            }
        }
    }
}
