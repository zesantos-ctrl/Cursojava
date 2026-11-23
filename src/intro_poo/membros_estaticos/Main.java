package intro_poo.membros_estaticos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = teclado.nextDouble();

        // Metodos estaticos, e chamamos pelo nome da classe
        double c = Calculator.circumFerence(radius);
        double v = Calculator.volume(radius);

        System.out.printf("circumFerence: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
    }
}
