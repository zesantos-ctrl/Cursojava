package orientacaoaobjetos.application;

import orientacaoaobjetos.entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measure of triangle x: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();
        System.out.println("Enter the measure of triangle y: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle x area: %.4f.%n", areax);
        System.out.printf("Triangle y area: %.4f.%n", areay);

        if (areax > areay) {
            System.out.println("larger area: x");
        } else {
            System.out.println("larger area: y");
        }

    }
}
