package Exercicios.poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.width = teclado.nextDouble();
        retangulo.height = teclado.nextDouble();

        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimeter = %.2f%n ",retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n ",retangulo.diagonal());
        teclado.close();
    }
}
