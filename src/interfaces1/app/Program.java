package interfaces1.app;

import interfaces1.entites.CarRental;
import interfaces1.entites.Vehicle;
import interfaces1.model.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String carModel = teclado.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");

        // Converte o texto digitado em LocalDateTime, interpretando-o com o padrão do
        // fmt
        LocalDateTime start = LocalDateTime.parse(teclado.nextLine(), fmt);
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(teclado.nextLine(), fmt);

        CarRental cr = new CarRental(finish, start, new Vehicle(carModel));

        System.out.println("Entre com o preço por hora: ");
        double pricePerHour = teclado.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = teclado.nextDouble();

        RentalService rs = new RentalService(pricePerDay, pricePerHour, null);

        rs.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico" + String.format("%.2f%n", cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + cr.getInvoice().getTax());
        System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());

        teclado.close();
    }
}
