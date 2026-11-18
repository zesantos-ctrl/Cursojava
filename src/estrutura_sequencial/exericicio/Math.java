package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        double triangulo = (a * c) / 2;
        double circulo = c * c * 3.14159;
        double trapezio = ((a + b) * c) / 2;
        double quadrado = b * b;
        double retangulo = a * b;


        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
