package orientacaoaobjetos.membroestatico;

import java.util.Scanner;
import orientacaoaobjetos.util.Calculator;

public class Metodos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = teclado.nextDouble();

        //Deixando os metodos static, podemos chamar a classe diretamente sem precisar instaciar
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        teclado.close();
    }

}
