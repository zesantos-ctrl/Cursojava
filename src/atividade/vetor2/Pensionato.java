package atividade.vetor2;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Cria 10 posições
        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.print("Email: ");
            String email = teclado.nextLine();
            System.out.print("Room: ");
            int room = teclado.nextInt();

            vect[room] = new Rent(email, name);
        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }

        }
        teclado.close();
    }
}
