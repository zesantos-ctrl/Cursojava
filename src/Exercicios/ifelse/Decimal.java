
import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();

<<<<<<< HEAD
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo y");
        } else if (y == 0.0) {
            System.out.println("Eixo x");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("q3");
        } else {
            System.out.println("q4");
        }
=======

        if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		}
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}
		
>>>>>>> 8be01e62fe29ba94aae9230b0223f17c8b0caa23
    }
}