package atividade.poli.app;

import atividade.poli.entities.Employee;
import atividade.poli.entities.OutsourceEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = teclado.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = teclado.next().charAt(0);
            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Hour: ");
            int hour = teclado.nextInt();
            System.out.println("Value per hour: ");
            double PerHour = teclado.nextDouble();
            if (ch == 'y') {
                System.out.println("Additional charge: ");
                double addCharge = teclado.nextDouble();
                list.add(new OutsourceEmployee(name, hour, PerHour, addCharge));
            } else {
                list.add(new Employee(name, hour, PerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        teclado.close();
    }
}
