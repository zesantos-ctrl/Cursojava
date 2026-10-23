package trycatchs2.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import trycatchs2.app.model.entities.Reservation;

public class MuitoRuim {
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

            Date now = new Date();
            if (!checkin.before(now) || checkout.before(now)) {
                System.out.println("Error in reservation: Reservation dates for updatemust be future dates");
            } else if (!checkout.after(checkin)) {
                System.out.println("Error in reservation: Check-out date must beaftercheck-in date");
            } else {
                reservation.updateDates(checkin, checkout);
                System.out.println("Reservation:" + reservation);
            }
        }
        teclado.close();
    }
}