package poo_basico.construtores_this_encapsulamento.exercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Banco banco;

        System.out.println("Número da conta: ");
        int conta = teclado.nextInt();
        System.out.println("Digite seu nome: ");
        teclado.nextLine();
        String nome = teclado.nextLine();
        System.out.println("Tem deposito inicial? (S/N)");
        char resposta = teclado.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Digite o deposito inicial:  ");
            double deposito = teclado.nextDouble();
            banco = new Banco(nome, conta, deposito);
        } else {
            banco = new Banco(nome, conta);
        }

        System.out.println();
        System.out.println("Conta: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Valor do deposito: ");
        double depositoValor = teclado.nextDouble();
        banco.depositar(depositoValor);
        System.out.println("Conta atualizada: ");
        System.out.println(banco);

        System.out.println();
        System.out.print("Valor do saque: ");
        double saque = teclado.nextDouble();
        banco.sacar(saque);
        System.out.println("Conta atualizada: ");
        System.out.println(banco);


        teclado.close();
    }
}
