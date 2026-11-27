package memoria_arrays_listas.pensionato;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Rent r = new Rent();

        Rent[] room = new Rent[10];

        System.out.print("Quantos quartos serão alugados? ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.printf("Rent #%d:\n", i + 1);
            System.out.print("Nome: ");
            teclado.nextLine();
            r.setNome(teclado.nextLine());
            System.out.print("Email: ");
            r.setEmail(teclado.nextLine());
            System.out.print("Room: ");
            int roomNumber = teclado.nextInt();

            room[roomNumber] = new Rent(r.getNome(), r.getEmail());

        }

        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if (room[i] != null) {
                System.out.println(i + ": " + room[i]);
            }
        }

    }

}
