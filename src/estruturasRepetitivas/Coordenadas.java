package estruturasRepetitivas;

import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int y = teclado.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("Quatro");
            }
        }
    }
}
