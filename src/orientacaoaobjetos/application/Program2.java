package orientacaoaobjetos.application;

import java.util.Scanner;
import orientacaoaobjetos.entities.Product;

public class Program2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = teclado.nextLine();
        System.out.println("Price: ");
        double price = teclado.nextDouble();
      
        Product product = new Product(name, price);

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
