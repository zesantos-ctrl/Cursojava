package memoria_arrays_listas;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
        Vetor2[] vect = new Vetor2[n];

        for (int i = 0; i < vect.length; i++) {
            teclado.nextLine();
            String nome = teclado.nextLine();
            double preco = teclado.nextDouble();
            vect[i] = new Vetor2(nome, preco);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPreco();
        }

        double avg = sum / vect.length;
        System.out.printf("Media dos preços: %.2f%n", avg);

        teclado.close();
    }
}
