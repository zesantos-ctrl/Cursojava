package trycatchs2.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import trycatchs2.app.model.entities.Reservation;

public class Boa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = teclado.nextInt();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkin = sdf.parse(teclado.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkout = sdf.parse(teclado.next());

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation:" + reservation);

            System.out.println();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(teclado.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(teclado.next());

            reservation.updateDates(checkin, checkout);
            System.out.println("Reservation:" + reservation);
        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (IllegalArgumentException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        teclado.close();
    }
}
