package atividade.repfors;

import java.util.Scanner;

public class Inteiro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();
        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i); 
            }
        }
        teclado.close();
    }
}
