package Exercicios.encapsulamento;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario user;

        System.out.println("Enter account number: ");
        int number = teclado.nextInt();
        System.out.println("Enter account holder: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char reposnse = teclado.next().charAt(0);

        if (reposnse == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = teclado.nextDouble();
            user = new Usuario(initialDeposit, holder, number);
        } else {
            user = new Usuario(holder, number);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(user);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = teclado.nextDouble();
        user.deposit(depositValue);
        System.out.println("Update  account data: ");
        System.out.println(user);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = teclado.nextDouble();
        user.withdraw(withdrawValue);
        System.out.println("Update  account data: ");
        System.out.println(user);

        teclado.close();
    }
}
