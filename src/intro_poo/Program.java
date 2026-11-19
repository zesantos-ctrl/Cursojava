package intro_poo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        System.out.println("");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        // chamada do metodo
        double areax = x.area();
        double areay = x.area();

        System.out.println(" x " + areax);
        System.out.println(" y " + areay);

        if (areax > areay) {
            System.out.println("x");
        } else {
            System.out.println("y");
        }
    }
}
