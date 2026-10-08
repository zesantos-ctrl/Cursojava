package matrizes;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();

        // Array bidimensional
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < n; i++) {
            System.out.println(mat[i][i] + "");
        }

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Quantidade de negativos: " + count);

        teclado.close();
    }
}
