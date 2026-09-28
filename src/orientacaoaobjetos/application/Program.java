package orientacaoaobjetos.application;

import orientacaoaobjetos.entities.Triangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Triangle x, y;
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

        double areax = x.area();
        double areay = y.area();

        System.out.printf("Triangle x area: %.4f.%n", areax);
        System.out.printf("Triangle y area: %.4f.%n", areay);

        if (areax > areay) {
            System.out.println("larger area: x");
        } else {
            System.out.println("larger area: y");
        }
        teclado.close();
    }
}
