
import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a = teclado.nextDouble();
        double b = teclado.nextDouble();

        if (a == 0.0 && b == 0.0) {
            System.out.println("Origem");
        } else if (a == 0.0) {
            System.out.println("Eixo Y");
        } else if (b == 0.0) {
            System.out.println("Eixo X");
        } else if (a > 0.0 && b > 0.0) {
            System.out.println("Q1");
        } else if (a < 0.0 && b > 0.0) {
            System.out.println("Q2");
        } else if (a < 0.0 && b < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }
}