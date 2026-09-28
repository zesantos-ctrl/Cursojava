package Exercicios.whiles;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int escolha = teclado.nextInt();
        while (escolha != 4) {
            if (escolha == 1) {
                alcool += escolha;
            } else if (escolha == 2) {
                gasolina += escolha;
            } else if (escolha == 3) {
                diesel += escolha;
            }
            escolha = teclado.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        teclado.close();
    }
}
