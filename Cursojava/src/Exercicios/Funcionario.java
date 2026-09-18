package Exercicios;

import java.util.Enumeration;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero do funcionario:  ");
        int funcionario = teclado.nextInt();

        System.out.println("Salario: ");
        double salario = teclado.nextDouble();

        System.out.println("Horas trabalhadas: ");
        double hora = teclado.nextDouble();

        System.out.println("Numero : " + funcionario);
        double salary = salario * hora;
        System.out.println("teste: "+ salary);
    }
}
