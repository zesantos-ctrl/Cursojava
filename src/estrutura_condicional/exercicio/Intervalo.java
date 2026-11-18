import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double n = teclado.nextDouble();
        if (n < 0.0 || n > 100.0) {
            System.out.println("Fora do intervalo");
        } else if (n <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (n <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (n <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }
    }
}
