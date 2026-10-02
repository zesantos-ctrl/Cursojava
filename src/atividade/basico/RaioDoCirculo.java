package atividade.basico;

import java.util.Scanner;

public class RaioDoCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = teclado.nextDouble();

        double area =  Math.PI * raio * raio;

        System.out.printf("%.4f%n",area);
        teclado.close();
    }
}
