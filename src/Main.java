import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // Use as vezes Math.sqrt, pow e etc
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();

        int distancia = x * 2;
        System.out.println(distancia + " minutos");
    }
}