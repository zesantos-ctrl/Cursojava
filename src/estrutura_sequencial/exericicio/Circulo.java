package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double raio = teclado.nextDouble();

        double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.printf("%.4f%n",area);
    }
}
