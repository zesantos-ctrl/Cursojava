package atividade.poo;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Name: ");
        funcionario.name = teclado.nextLine();
        System.out.println("Gross Salary: ");
        funcionario.grossSalary = teclado.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = teclado.nextDouble();

        System.out.println();
        System.out.println("Employee: " + funcionario);
        System.out.println();
        System.out.println("Wich percentage to increase salary? ");
        double percentage = teclado.nextDouble();
        funcionario.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: " + funcionario);
        teclado.close();
    }
}
