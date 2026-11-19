package intro_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("");
        System.out.println("Name: ");
        p.nome = teclado.nextLine();
        System.out.println("Preco: ");
        p.preco = teclado.nextDouble();
        System.out.println("Quantidade: ");
        p.quantidade = teclado.nextInt();
        System.out.println(p.nome + p.preco + p.quantidade);
    }
}
