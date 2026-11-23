package intro_poo.exercicio_estatico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual o valor do dolar? ");
        double dolar = teclado.nextDouble();

        System.out.println("Quantos dolar vai comprar? ");
        double amount = teclado.nextDouble();

        // Chamada do metodo estatico
        double resultado = Conversao.dolarParaReal(amount, dolar);

        System.out.printf("Saldo de reais para comprar dolar = %.2f%n", resultado);
    }
}
