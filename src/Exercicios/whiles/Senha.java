package Exercicios.whiles;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
       Scanner teclado =  new Scanner(System.in);

       int senha = 0;
       while (senha != 2002) {
           System.out.println("Senha invalida");
           senha = teclado.nextInt();
       }
        System.out.println("Acesso permitido");
        teclado.close();
    }
}
