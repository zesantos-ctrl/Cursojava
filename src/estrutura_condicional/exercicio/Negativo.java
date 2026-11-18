package estrutura_condicional.exercicio;

import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }
    }
}
