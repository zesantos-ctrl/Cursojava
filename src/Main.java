import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int cod1;
        int cod2;
        int qted1;
        int qted2;

        double preco1, preco2, total;
        cod1 = teclado.nextInt();
        qted1 = teclado.nextInt();
        preco1 = teclado.nextDouble();
        cod2 = teclado.nextInt();
        qted2 = teclado.nextInt();
        preco2 = teclado.nextDouble();

        total = preco1 * qted1 + preco2 * qted2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }

}