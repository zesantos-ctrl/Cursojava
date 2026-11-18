package estrutura_sequencial.exericicio;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o pirmeiro numero: ");
        int a = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        int b = teclado.nextInt();

        int resultado = a + b;
        System.out.println("SOMA = " + resultado);
    }
}
