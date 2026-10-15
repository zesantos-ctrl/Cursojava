package atividade.enumeracao.application;

import atividade.enumeracao.entities.Departamento;
import atividade.enumeracao.entities.HorasContrato;
import atividade.enumeracao.entities.Worker;
import atividade.enumeracao.enums.WorkerLevel;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com o nome do departamento: ");
        String departamentoName = teclado.nextLine();
        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = teclado.nextLine();
        System.out.print("Level: ");
        String workerLevel = teclado.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = teclado.nextDouble();
        // instancia de um novo objeto worker, dados | novo objeto departamento
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
                new Departamento(departamentoName));

        System.out.println("");
        int n = teclado.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = (Date) sdf.parse(teclado.nextLine());
            System.out.println("Value per hour: ");
            double ValuePerHour = teclado.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = teclado.nextInt();
            HorasContrato contrato = new HorasContrato(contractDate, ValuePerHour, hours);
            worker.addContrato(contrato);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = teclado.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartamento().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        teclado.close();
    }
}
