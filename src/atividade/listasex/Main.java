package atividade.listasex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantos funcionarios deseja cadastrar?");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Funcionario #" + (i + 1));
            System.out.println("Id: ");
            Integer id = teclado.nextInt();
            while (hasId(list, id)) {
                System.out.println("Id ja cadastrado! Digite outro id");
                id = teclado.nextInt();
            }

            System.out.println("Name: ");
            teclado.nextLine();
            String name = teclado.nextLine();
            System.out.println("Id: ");
            double salary = teclado.nextDouble();

            Funcionario func = new Funcionario(id, name, salary);

            list.add(func);
        }

        System.out.println();
        System.out.println("Digite o id do funcionario que deseja aumentar o salario: ");
        int idsalary = teclado.nextInt();

        Funcionario func = list.stream().filter(f -> f.getId() == idsalary).findFirst().orElse(null);

        // Integer pos = position(list, idsalary);

        if (func == null) {
            System.out.println("Esse id não existe!");
        } else {
            System.out.println("Digite a porcentagem de aumento: ");
            double percentage = teclado.nextDouble();
            func.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for (Funcionario e : list) {
            System.out.println(e);
        }
        teclado.close();
    }

    // outro exemplo de como fazer a busca do id do funcionario
    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return fun != null;
    }
}
