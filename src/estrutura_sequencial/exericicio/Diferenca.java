package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c, d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        int diferenca = (a * b - c * d);
        System.out.println("DIFERENÇA = " + diferenca);
    }
}
