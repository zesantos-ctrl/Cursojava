package atividade.poli2.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Datos do produto #" + i + ": ");
            System.out.print("Comum, usado, importado (c/u/i)? ");
            char ch = teclado.next().charAt(0);
            System.out.println("Nome: ");
            teclado.nextLine();
            System.out.println("Preço: ");
            double price = teclado.nextDouble();
            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {

            } else {
                System.out.print("Taxe de importação: ");
            }
        }
    }
}
