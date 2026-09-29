
import java.util.Scanner;

public class Pares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
      
        for (int i = 0; i < n; i++) {
            int x = teclado.nextInt();
            int y = teclado.nextInt();

            if (y == 0) {
                System.out.println("Divisao impossivel");
            } else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
            }
        }
        teclado.close();
    }
}