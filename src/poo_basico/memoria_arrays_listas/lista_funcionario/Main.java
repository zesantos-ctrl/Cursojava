package lista_funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Funcionario> f = new ArrayList<>();

        System.out.print("Quantos funcionarios serão registrados? ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Funcionario #%d:\n", i + 1);
            System.out.print("Id: ");
            int id = teclado.nextInt();
            System.out.print("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine();
            System.out.print("Salario: ");
            double salario = teclado.nextDouble();
            Funcionario func = new Funcionario(id, nome, salario);
            f.add(func);
        }

        System.out.println("Enter the employee id that  will have salary inrease: ");
        int idBusca = teclado.nextInt();
        Funcionario idResult = f.stream()
                .filter(x -> x.getId() == idBusca)
                .findFirst().orElse(null);

        System.out.println("Enter the percentage: ");
        double pc = teclado.nextDouble();
        idResult.aumento(pc);

        System.out.println("Lista de funcionarios: ");
        for (Funcionario t : f) {
            System.out.println(t);
        }
    }
}
