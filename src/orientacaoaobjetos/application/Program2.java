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

        
        teclado.close();
    }
}
