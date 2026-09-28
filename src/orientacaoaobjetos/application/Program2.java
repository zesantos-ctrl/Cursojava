package orientacaoaobjetos.application;

import java.util.Scanner;
import orientacaoaobjetos.entities.Product;

public class Program2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = teclado.nextLine();
        System.out.println("Price: ");
        product.price = teclado.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = teclado.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = teclado.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be remove from stock: ");
        quantity = teclado.nextInt();
        product.removeProducts(quantity);

        teclado.close();
    }
}
