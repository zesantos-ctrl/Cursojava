package atividade.poli2.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import atividade.poli2.entities.ImportProduct;
import atividade.poli2.entities.Product;
import atividade.poli2.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
            String name = teclado.nextLine();
            System.out.println("Preço: ");
            double price = teclado.nextDouble();
            if (ch == 'c') {
                list.add(new Product(name, price));
            } else if (ch == 'u') {
                System.out.println("Data de fabricacao (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(teclado.next(), DateTimeFormatter.ofPattern("dd/M/yyyy"));
                list.add(new UsedProduct(name, price, date));
            } else {
                System.out.print("Taxe de importação: ");
                double customeFee = teclado.nextDouble();
                list.add(new ImportProduct(name, price, customeFee));
            }
        }

        System.out.println();
        System.out.println("ETIQUETA DE PRECO: ");
        for (Product prod : list) {
            System.out.println(prod.priceTag());
        }
        teclado.close();
    }
}
