package atividade.enumeracaotres.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import atividade.enumeracaotres.entities.Client;
import atividade.enumeracaotres.entities.OrdemItem;
import atividade.enumeracaotres.entities.Order;
import atividade.enumeracaotres.entities.Produto;
import atividade.enumeracaotres.enums.OrderStatus;
import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = teclado.nextLine();
        System.out.println("Email: ");
        String email = teclado.nextLine();
        System.out.println("birth date (dd/MM/yyyy):");
        Date birthDate = sdf.parse(teclado.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(teclado.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many itms to this order? ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data");
            System.out.println("Product name: ");
            teclado.nextLine();
            System.out.println("Product price: ");
            double productPrice = teclado.nextDouble();

            Produto produto = new Produto(name, productPrice);

            System.out.println("Quantity: ");
            int quanity = teclado.nextInt();

            OrdemItem ordemItem = new OrdemItem(quanity, productPrice, produto);

            order.addItem(ordemItem);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);

        teclado.close();
    }
}
