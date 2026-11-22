package intro_poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto p = new Produto();

        System.out.println("Enter product data");
        System.out.print("Name: ");
        p.nome = teclado.nextLine();
        System.out.print("Preco: ");
        p.preco = teclado.nextDouble();
        System.out.print("Quantidade: ");
        p.quantidade = teclado.nextInt();

        System.out.println();
        System.out.println("Produto: " + p);

        System.out.println();
        System.out.println("Enter the number products to be added in stock: ");
        int quantidade = teclado.nextInt();
        p.addProduto(quantidade);

        System.out.println();
        System.out.println("Produto: " + p);

        System.out.println();
        System.out.println("Enter the number products to be removed in stock: ");
        quantidade = teclado.nextInt();
        p.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Produto: " + p);
    }
}
