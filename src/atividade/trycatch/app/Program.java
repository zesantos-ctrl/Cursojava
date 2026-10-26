package atividade.trycatch.app;

import atividade.trycatch.entities.Account;
import atividade.trycatch.model.MyException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Numero: ");
        int n = teclado.nextInt();
        System.out.println("Titular: ");
        teclado.nextLine();
        String holder = teclado.nextLine();
        System.out.println("Saldo inicial: ");
        double balance = teclado.nextDouble();
        System.out.println("Limite de saque: ");
        double withdrawLimit = teclado.nextDouble();

        Account acc = new Account(balance, holder, null, withdrawLimit);

        System.out.println();
        System.out.println("Informe uma quantia para sacar: ");
        double amount = teclado.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("Novo saldo: %.2f%n", acc.getBalance());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}
