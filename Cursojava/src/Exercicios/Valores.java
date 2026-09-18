package Exercicios;

import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double a,b,c, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.println("a: ");
        a = teclado.nextDouble();
        System.out.println("b: ");
        b = teclado.nextDouble();
        System.out.println("c: ");
        c= teclado.nextDouble();

        triangulo = a * b / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
