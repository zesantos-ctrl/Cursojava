package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero do funcionario: ");
        int numero = teclado.nextInt();
        System.out.println("Hora de trabalho: ");
        int hora = teclado.nextInt();
        System.out.println("Salario: ");
        double salario = teclado.nextDouble();

        double resul = hora * salario;

        System.out.println("Number = " + numero);
        System.out.printf("Salary = R$ %.2f%n ", resul);

    }
}
