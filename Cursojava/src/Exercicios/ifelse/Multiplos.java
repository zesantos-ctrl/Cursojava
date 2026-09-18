
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b;
        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        b = teclado.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São multiplos");
        } else {
            System.out.println("não são multiplos");
        }
    }
}
