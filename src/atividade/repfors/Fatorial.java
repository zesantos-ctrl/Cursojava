package atividade.repfors;
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        int fatorial = 1;
        for (int i = 0; i < n; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
