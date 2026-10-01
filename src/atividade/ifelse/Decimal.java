package atividade.ifelse;

import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x = teclado.nextDouble();
        double y = teclado.nextDouble();
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
    }
}