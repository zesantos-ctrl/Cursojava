package memoria_arrays_listas;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos quartos? ");
        int n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d: \n", i + 1);
            System.out.println("Nome: ");
            teclado.nextLine();
            String nome = teclado.nextLine(); 
        }
    }

}
