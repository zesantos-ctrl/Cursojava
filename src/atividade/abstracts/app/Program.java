package atividade.abstracts.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividade.abstracts.enities.Company;
import atividade.abstracts.enities.Individual;
import atividade.abstracts.enities.TaxPayer;

public class Program {
    public static void main(String[] args) {

        List<TaxPayer> list = new ArrayList<TaxPayer>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.println("Individual or company (i/c)? ");
            char ch = teclado.next().charAt(0);
            teclado.nextLine();
            System.out.println("Name: ");
            String name = teclado.nextLine();
            System.out.println("Anual income: ");
            double income = teclado.nextDouble();

            if (ch == 'i') {
                System.out.println("Health expenditures: ");
                double he = teclado.nextDouble();
                list.add(new Individual(name, income, he));
            } else {
                System.out.println("Numberof employees");
                Integer numberEmployeer = teclado.nextInt();
                list.add(new Company(name, income, n));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");

        teclado.close();
    }
}
