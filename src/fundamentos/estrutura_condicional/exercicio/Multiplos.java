package estrutura_condicional.exercicio;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite ");
        int a = teclado.nextInt();
        System.out.println("digite ");
        int b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Multiplos");
        } else {
            System.out.println("Não multiplos ");
        }
    }
}
