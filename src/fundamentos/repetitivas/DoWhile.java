package fundamentos.repetitivas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
         * do {
         * comando 1
         * comando 2
         * } while(condição);
         */
        char resp;
        do {
            System.out.println("Digite a temperatura em celsius: ");
            double c = teclado.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", f);
            System.out.print("Deseja repetir (s/n)");
            resp = teclado.next().charAt(0);
        } while (resp != 'n');
        teclado.close();
    }
}
