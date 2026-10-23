package trycatchs2.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import trycatchs2.app.model.entities.Reservation;

public class Ruim {
    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room number: ");
        int number = teclado.nextInt();
        System.out.println("Check-in date (dd/MM/yyyy): ");
        Date checkin = sdf.parse(teclado.next());
        System.out.println("Check-out date (dd/MM/yyyy): ");
        Date checkout = sdf.parse(teclado.next());

        if (!checkout.after(checkin)) {
            System.out.println("Errorin reservation: Check-out date must beaftercheck-in date");
        } else {

            Reservation reservation = new Reservation(number, checkin, checkout);
            System.out.println("Reservation:" + reservation);

            System.out.println();
            System.out.println("Check-in date (dd/MM/yyyy): ");
            checkin = sdf.parse(teclado.next());
            System.out.println("Check-out date (dd/MM/yyyy): ");
            checkout = sdf.parse(teclado.next());

            String error = reservation.updateDates(checkin, checkout);
            if (error != null) {
                System.out.println("error in reservation: " + error);
            } else {
                System.out.println("Reservation:" + reservation);
            }
        }
        teclado.close();
    }
}
