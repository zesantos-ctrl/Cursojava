package construtores_this_encapsulamento;

import java.util.Scanner;

import poo_basico.construtores_this_encapsulamento.Produto;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String nome = teclado.nextLine();
        System.out.print("Preco: ");
        double preco = teclado.nextDouble();
        Produto p = new Produto(nome, preco);

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
