<<<<<<< HEAD
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
=======

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = teclado.nextInt();
        if (hora < 12) {
            System.out.println("Bom dia ");
        } else if (hora < 18) {
            System.out.println("Boa tarde ");
        } else {
             System.out.println("Boanoite ");
            }
           
        }

        teclado.close();
 }
>>>>>>> d5370718a9dfdbda8d3e227e909070ae6df86ff6
}
