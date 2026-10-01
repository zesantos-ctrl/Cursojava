import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        int maiorAb = (a + b + Math.abs(a-b)) / 2;
        int maior = (maiorAb + c + Math.abs(maiorAb - c)) / 2;
        System.out.println(maior + " eh o maior");
    }
}