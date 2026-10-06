package vetores.app;

<<<<<<< Updated upstream
import java.util.Scanner;

import vector.entiti.Produto;

=======
import vetores.entities.Product;

import java.util.Scanner;

>>>>>>> Stashed changes
public class VetoresPrartII {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n = teclado.nextInt();
<<<<<<< Updated upstream
        Produto[] vect = new Produto[n];
=======
        Product[] vect = new Product[n];
>>>>>>> Stashed changes

        for (int i = 0; i < vect.length; i++) {
            teclado.nextLine();
            String name = teclado.nextLine();
            double price = teclado.nextDouble();
<<<<<<< Updated upstream
            vect[i] = new Produto(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

=======
            vect[i] = new Product(name, price);
            //o vect esta apontando para classe produto
        }

        double sum = 0.0;
        for (int i=0;i< vect.length;i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("AVERAGE PRICE = %.2F%N", avg);
>>>>>>> Stashed changes
        teclado.close();
    }
}
