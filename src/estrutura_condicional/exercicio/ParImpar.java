package estrutura_condicional.exercicio;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

}
