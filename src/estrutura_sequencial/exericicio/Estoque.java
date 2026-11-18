package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = teclado.nextInt();
        qte1 = teclado.nextInt();
        preco1 = teclado.nextDouble();

        cod2 = teclado.nextInt();
        qte2 = teclado.nextInt();
        preco2 = teclado.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

    }
}
