<<<<<<< HEAD
package Exercicios.ifelse;
=======
>>>>>>> 8be01e62fe29ba94aae9230b0223f17c8b0caa23

import java.util.Scanner;

public class Imposto {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite aqui");
        double salario = teclado.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else  {
            System.out.printf("R$ %.2f%n", imposto);
        }

=======

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		}
		else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
>>>>>>> 8be01e62fe29ba94aae9230b0223f17c8b0caa23
    }
}
